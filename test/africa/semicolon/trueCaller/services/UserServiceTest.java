package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import exception.UserExistsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private IUserService userService;
    @BeforeEach
    void setUserService(){
        userService = new UserService(contactService);
    }

    @Test
    void registerTest(){

        //given
        //there is a request form
        RegisterRequest request = new RegisterRequest();
        request.setEmail("ola@gmail.com");
        request.setFirstName("Ola");
        request.setSecondName("Ope");
        request.setPhoneNumber("24131");
        request.setPassword("ilovejesus77");

        //when
        userService.register(request);
        //i try to register

        //assert
        //repository size is one
        assertEquals(1,userService.getNumberOfUsers());
    }
@Test
    void duplicateEmailThrowsException(){
    RegisterRequest request = new RegisterRequest();
    request.setEmail("ola@gmail.com");
    request.setFirstName("Ola");
    request.setSecondName("Ope");
    request.setPhoneNumber("24131");
    request.setPassword("ilovejesus77");
    userService.register(request);

    RegisterRequest request2 = new RegisterRequest();
    request.setEmail("ola@gmail.com");
    request.setFirstName("Ola");
    request.setSecondName("Ope");
    request.setPhoneNumber("24131");
    request.setPassword("ilovejesus77");
    userService.register(request);

    assertEquals(1,userService.getNumberOfUsers());
    assertThrows(UserExistsException.class,()-> userService.register(request2));

}

@Test
    public void addContactTest(){
        IUserService userService = new UserService(contactService);
        RegisterRequest request = new RegisterRequest();

        request.setEmail("Olns@gmail.com");
        request.setFirstName("Olamide");
        request.setSecondName("Victor");
        request.setPassword("131");
        request.setPhoneNumber("24256524");
        userService.register(request);

    AddContactRequest addContactRequest = new AddContactRequest();
    addContactRequest.setUserEmail("Ola@gmail.com");
    addContactRequest.setFirstName("UCJ");
    addContactRequest.setLastName("JJC");
    addContactRequest.setEmail("Ucj@gmail.com");
    addContactRequest.setPhoneNumber("552428024");
    userService.addContact(addContactRequest);

    assertEquals(1,userService.findContactsBelongingTo("ola@mail.com").size());

}
}