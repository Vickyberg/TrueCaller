package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.AddContactResponse;
import africa.semicolon.trueCaller.dtos.responses.RegisterUserResponse;

public interface IUserService {
    RegisterUserResponse register(RegisterRequest request);

    int getNumberOfUsers();

    AddContactResponse addContact(AddContactRequest request);
}
