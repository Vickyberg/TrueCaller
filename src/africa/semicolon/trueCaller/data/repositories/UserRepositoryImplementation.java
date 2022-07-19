package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImplementation implements UserRepository {

    private  List<Contact> contacts = new ArrayList<>();
    private  int counter;
    @Override
    public Contact save(Contact contact) {
        counter++;
        for (var myContact : contacts){
            if(contact.getId() == myContact.getId()){
                counter++;
            }
        }
       contacts.add(contact);
        contact.setId(counter);
       return contact;

    }

    @Override
    public void delete(Contact contact) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Contact> findAll() {
        return null;
    }

    @Override
    public int count() {
        return contacts.size() ;
    }

    @Override
    public Contact findById(int id) {
        for (var contact : contacts){
            if(contact.getId() == id){
                return contact;
            }
        }
        return null;
    }
}
