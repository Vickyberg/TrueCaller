package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.data.repositories.ContactRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactServiceTest {
    ContactService contactService;
    ContactRepository contactRepository;
    Contact contact;
    @BeforeEach
    void setUp() {
        contactRepository = new ContactRepositoryImpl();
        contactService = new ContactServiceImpl(contactRepository);
        contact = new Contact();

        contact.setEmail("newford@gmail.com");
        contact.setFirstName("New");
        contact.setLastName("Ford");
        contact.setPhoneNumber("08024533933");
    }

    @Test
    public void addContactTest() {
        contactService.addNewContact(contact);

        assertEquals(1, contactService.totalContacts());
    }
}
