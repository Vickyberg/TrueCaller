package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private IUserService userService;
    @BeforeEach
    void setUserService(){
        userService = new UserService();
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
    request.setFirstName("wahala");
    request.setSecondName("jdj");
    request.setPhoneNumber("241313");
    request.setPassword("newPassWord");

}
}