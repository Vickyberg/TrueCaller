package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.repositories.ContactRepository;
import africa.semicolon.trueCaller.data.repositories.UserRepository;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.exception.UserExistsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    UserService userService;
    RegisterRequest request;
    AddContactRequest addRequest;
    ContactService contactService;
    UserRepository userRepository;
    ContactRepository contactRepository;


    @BeforeEach
    void setUp() {
        contactRepository = new ContactRepositoryImpl();
        contactService = new ContactServiceImpl(contactRepository);
        userRepository = new UserRepositoryImpl();
        userService = new UserServiceImpl(userRepository, contactService);
        addRequest = new AddContactRequest();

        request = new RegisterRequest();
        request.setEmail("johnford@gmail.com");
        request.setUsername("johnford2");
        request.setPassword("johnny234");
    }

    @Test
    public void registerTest() {
        userService.register(request);

        assertEquals(1, userService.totalUsers());
    }

    @Test
    public void duplicateRegistrationThrowsException() {
        userService.register(request);

        RegisterRequest request1 = new RegisterRequest();
        request1.setEmail("johnford@gmail.com");

        request1.setUsername("ashford2");
        request1.setPassword("ashy1234");

        assertThrows(UserExistsException.class, () -> userService.register(request1));
        assertEquals(1, userService.totalUsers());
    }

    @Test
    public void addContactTest() {
        userService.register(request);

        addRequest.setEmail("newford@gmail.com");
        addRequest.setFirstName("New");
        addRequest.setLastName("Ford");
        addRequest.setPhoneNumber("08024533933");
        addRequest.setUserEmail(request.getEmail());
        userService.addContact(addRequest);

        assertEquals(1, userService.findAllUserContacts("johnford@gmail.com").size());
        assertEquals(1, contactService.totalContacts());
    }

}