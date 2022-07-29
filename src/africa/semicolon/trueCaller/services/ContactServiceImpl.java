package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.data.repositories.ContactRepository;

public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact addNewContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public int totalContacts() {
        return contactRepository.count();
    }
}
