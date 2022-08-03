package africa.semicolon.trueCaller.utils;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.data.models.User;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.AllContactResponse;

public class Mapper {
    public static void map(RegisterRequest request, User user) {

        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
    }

    public static void map(AddContactRequest addRequest, Contact contact) {
        contact.setEmail(addRequest.getEmail());
        contact.setPhoneNumber(addRequest.getPhoneNumber());
        contact.setFirstName(addRequest.getFirstName());
        contact.setLastName(addRequest.getLastName());
    }

    public static void map(Contact contact, AllContactResponse singleResponse) {
        singleResponse.setId(contact.getId()+ "");
        singleResponse.setLastName(contact.getLastName());
        singleResponse.setFirstName(contact.getFirstName());
    }
}
