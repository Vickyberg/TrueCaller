package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.AddContactResponse;
import africa.semicolon.trueCaller.dtos.responses.RegisterResponse;
import java.util.List;

public interface UserService {
    RegisterResponse register(RegisterRequest request);

    int totalUsers();
    AddContactResponse addContact(AddContactRequest addRequest);

    List<Contact> findAllUserContacts(String email);
}
