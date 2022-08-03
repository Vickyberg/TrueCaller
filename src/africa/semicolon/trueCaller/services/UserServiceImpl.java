package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.data.models.User;
import africa.semicolon.trueCaller.data.repositories.UserRepository;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.AddContactResponse;
import africa.semicolon.trueCaller.dtos.responses.AllContactResponse;
import africa.semicolon.trueCaller.dtos.responses.RegisterResponse;
import africa.semicolon.trueCaller.utils.Mapper;
import africa.semicolon.trueCaller.exception.UserExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepository userRepository;
    @Autowired
    private ContactService contactService;

    public UserServiceImpl(UserRepository userRepository, ContactService contactService) {
        this.userRepository = userRepository;
        this.contactService = contactService;
    }

    @Override
    public RegisterResponse register(RegisterRequest request) {
        isExist(request);

        User user = new User();
        Mapper.map(request, user);

        userRepository.save(user);

        RegisterResponse response = new RegisterResponse();
        response.setMessage("Registration successful!");

        return response;
    }


    private void isExist(RegisterRequest request) {
        User savedUser = userRepository.findByEmail(request.getEmail());
        if(savedUser != null) throw new UserExistsException(request.getEmail() + " already exists.");
    }


    @Override
    public int totalUsers() {
        return (int) userRepository.count();
    }

    @Override
    public AddContactResponse addContact(AddContactRequest addRequest) {
        Contact contact = new Contact();

        Mapper.map(addRequest, contact);
        Contact newContact = contactService.addNewContact(contact);

        User user = userRepository.findByEmail(addRequest.getUserEmail());
        user.getContacts().add(newContact);

        userRepository.save(user);
        AddContactResponse response = new AddContactResponse();
        response.setMessage(String.format("%s successfully added", addRequest.getFirstName()));
        return response;
    }


    @Override
    public List<AllContactResponse> findAllUserContacts(String email) {
        User user = userRepository.findByEmail(email);
        List<Contact> allUserContacts = user.getContacts();
        List<AllContactResponse> response = new ArrayList<>();
        for(var contact : allUserContacts){
            AllContactResponse singleResponse = new AllContactResponse();
            Mapper.map(contact,singleResponse);
            response.add(singleResponse);
        }
        return response;


    }
}
