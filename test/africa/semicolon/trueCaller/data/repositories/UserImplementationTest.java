package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserImplementationTest {

    @Test
    void testThatUserCanBeCreated_And_ContactCanBeSaved_And_ContactCanBeFoundById(){
        UserRepository userRepository = new UserRepositoryImplementation();//user creation
        Contact contact = new Contact();
        contact.setFirstName("Ola");
        contact.setSecondName("Victor");
        contact.setPhoneNumber("935322");
        contact.setEmail("Ooen31@gmail.com");
        userRepository.save(contact);//save contact
        assertEquals(1,userRepository.count());

        //to find the contact saved by using it id
        Contact contactSaved = userRepository.findById(1);//find by Id
        assertEquals(1,contact.getId());
    }

    @Test
    void testThatContactCanBeDeleted_FindByIn(){

    }

}
