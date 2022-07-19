package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.Contact;

import java.util.List;

public interface UserRepository {
    Contact save(Contact contact);
    void delete(Contact contact);
    void delete(int id);
    List<Contact> findAll();

    int count();

    Contact findById(int id);
}
