package africa.semicolon.trueCaller.services;


import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.data.models.User;
import africa.semicolon.trueCaller.data.repositories.UserRepository;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.AddContactResponse;
import africa.semicolon.trueCaller.dtos.responses.RegisterUserResponse;

import java.util.List;

public class UserService implements  IUserService{

private final UserRepository userRepository ;
private final ContactService contactService;


    public UserService( UserRepository userRepository1, ContactService contactService) {
            this.userRepository = userRepository1;
            this.contactService = contactService;
    }

    @Override
    public RegisterUserResponse register(RegisterRequest request) {
        // create a new user
        User savedUser = userRepository.findByUSerName(request.getUsername());
       // if(savedUser != null) throw new UserEx

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        //copy fields from request to new user
        userRepository.save(user);
        //save new user into repository
        RegisterUserResponse response = new RegisterUserResponse();
        response.setMessage("Success!!!");
        return response;

    }

    @Override
    public int getNumberOfUsers() {
        return userRepository.count();
    }

    @Override
    public AddContactResponse addContact(AddContactRequest request) {
        Contact contact = new Contact();

        return null;
    }

    @Override
    public List<Contact> findContactsBelongingTo(String userEmail) {
        return null;
    }
}
