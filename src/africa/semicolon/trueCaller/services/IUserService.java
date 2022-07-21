package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.RegisterUserResponse;

public interface IUserService {
    RegisterUserResponse register(RegisterRequest request);

    int getNumberOfUsers();
}
