package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    void delete(User user);
    void delete(int id);
    List<User> findAll();

    int count();

    User findById(int id);


    int getId();

    User findByUSerName(String username);

    User findByEmail(String email);
}
