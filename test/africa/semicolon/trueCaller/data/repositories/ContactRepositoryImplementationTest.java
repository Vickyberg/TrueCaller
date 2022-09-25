//package africa.semicolon.trueCaller.data.repositories;
//
//import africa.semicolon.trueCaller.data.models.Contact;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ContactRepositoryImplementationTest {
//
//@Test
//    void saveContact_CountIncreasesTest(){
//    ContactRepository contactRepository = new ContactRepositoryImpl();
//    Contact contact = new Contact();
//    contact.setPhoneNumber("0989989");
//    contact.setFirstName("Ojo");
//    contact.setLastName("oJo");
//    contact.setEmail("ojo@gmail.com");
//
//    contactRepository.save(contact);
//    assertEquals(1,contactRepository.count());
//}
// @Test
//    void saveContact_findByIdTest(){
//    ContactRepository contactRepository = new ContactRepositoryImpl();
//     Contact contact = new Contact();
//     contact.setPhoneNumber("0989989");
//     contact.setFirstName("Ojo");
//     contact.setLastName("oJo");
//     contact.setEmail("ojo@gmail.com");
//     contactRepository.save(contact);
//     assertEquals(1,contactRepository.count());
//
//     Contact savedContact = contactRepository.findById(1);
//     assertEquals("Ojo",savedContact.getFirstName());
//
// }
// @Test
//    void deleteContact_findByIdTest(){
//    ContactRepository contactRepository =  new ContactRepositoryImpl();
//    Contact contact = new Contact();
//     contact.setPhoneNumber("0989989");
//     contact.setFirstName("Ojo");
//     contact.setLastName("oJo");
//     contact.setEmail("ojo@gmail.com");
//     contactRepository.save(contact);
//     assertEquals(1,contactRepository.count());
//
//     contactRepository.delete(1);
//     assertEquals(0,contactRepository.count());
//     Contact savedContact = contactRepository.findById(1);
//     assertNull(savedContact);
//
// }
// @Test
//    void updateContactTest(){
//     ContactRepository contactRepository =  new ContactRepositoryImpl();
//     Contact contact = new Contact();
//     contact.setPhoneNumber("0989989");
//     contact.setFirstName("Ojo");
//     contact.setLastName("oJo");
//     contact.setEmail("ojo@gmail.com");
//     contactRepository.save(contact);
//     assertEquals(1,contactRepository.count());
//
//     contact.setFirstName("Ola");
//     contact.setEmail("fjgn@gmail.com");
//
//     assertEquals("Ola",contact.getFirstName());
//     assertEquals("fjgn@gmail.com",contact.getEmail());
//
//
//
// }
//}