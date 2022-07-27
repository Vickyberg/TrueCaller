package africa.semicolon.trueCaller.services;


import africa.semicolon.trueCaller.data.models.User;
import africa.semicolon.trueCaller.data.repositories.UserRepository;
import africa.semicolon.trueCaller.data.repositories.UserRepositoryImplementation;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.RegisterUserResponse;

public class UserService implements  IUserService{

private UserRepository userRepository = new UserRepositoryImplementation();
private RegisterUserResponse userResponse = new RegisterUserResponse();

    @Override
    public RegisterUserResponse register(RegisterRequest request) {
        // create a new user
        User savedUser = userRepository.findByUSerName(request.getUsername());
       // if(savedUser != null) throw new UserEx

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        //copy fields from request to new user
        userRepository.save(user);
        //save new user into repository
        return userResponse;

    }

    @Override
    public int getNumberOfUsers() {
        return 0;
    }
}
