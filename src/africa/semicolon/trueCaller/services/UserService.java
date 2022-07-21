package africa.semicolon.trueCaller.services;


import africa.semicolon.trueCaller.data.models.User;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.RegisterUserResponse;

public class UserService implements  IUserService{



    @Override
    public RegisterUserResponse register(RegisterRequest request) {
        // create a new user
        //copy fields from request to new user
        //save new user into repository



        return null;
    }

    @Override
    public int getNumberOfUsers() {
        return 0;
    }
}
