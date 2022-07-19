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
    void testThatContactCanBeDeleted_FindById(){
        UserRepository userRepository = new UserRepositoryImplementation();//user creation
        Contact contact = new Contact();
        contact.setFirstName("Ola");
        contact.setSecondName("Victor");
        contact.setPhoneNumber("935322");
        contact.setEmail("Ooen31@gmail.com");
        userRepository.save(contact);//save contact
        assertEquals(1,userRepository.count());
        userRepository.delete(1);
        assertEquals(0,userRepository.count());

    }
    @Test
    void findAllContacts_WithIdTest(){
        UserRepository userRepository = new UserRepositoryImplementation();//user creation
        Contact contact = new Contact();
        contact.setFirstName("Ola");
        contact.setSecondName("Victor");
        contact.setPhoneNumber("935322");
        contact.setEmail("Ooen31@gmail.com");
        userRepository.save(contact);//save contact
        assertEquals(1,userRepository.count());

        Contact newContact = new Contact();
        contact.setFirstName("Ope");
        contact.setSecondName("Dapo");
        contact.setPhoneNumber("935322");
        contact.setEmail("Oerrwj31@gmail.com");
        userRepository.save(newContact);//save contact
        userRepository.findAll();
        assertEquals(2,userRepository.count());


    }

}
