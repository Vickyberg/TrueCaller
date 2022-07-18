package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImplementation implements ContactRepository{

    private  int counter;

    private List<Contact> contacts =  new ArrayList<>();
    @Override
    public Contact save(Contact contact) {
        counter++;
        for (var myContact : contacts){
            if (contact.getId() == myContact.getId()){
                counter = counter;
            }
        }
        contact.setId(counter);
        contacts.add(contact);
        return contact;
    }

    @Override
    public void delete(Contact contact) {


    }

    @Override
    public void delete(int id) {
        Contact foundContact = findById(id);
        contacts.remove(foundContact);

    }

    @Override
    public Contact findById(int id) {
        for (var contact: contacts){
            if(contact.getId() == id){
                return contact;
            }
        }
        return null;
    }

    @Override
    public List<Contact> findAll() {
        return null;
    }

    @Override
    public int count() {
        return contacts.size();
    }

    @Override
    public int getContactNumber() {
        return contacts.size();
    }


}
