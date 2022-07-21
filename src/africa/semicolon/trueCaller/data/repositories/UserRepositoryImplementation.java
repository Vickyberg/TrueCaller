package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImplementation implements UserRepository {

    private  List<User> users = new ArrayList<>();
    private  int counter;
    @Override
    public User save(User user) {

        for (var myUser : users){
            if(user.getId() == myUser.getId()){
                counter++;
            }
        }


        user.setId(counter);
        users.add(user);


       return user;

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(int id) {
    User foundContact = findById(id);
    users.remove(foundContact);

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public int count() {
        return users.size() ;
    }

    @Override
    public User findById(int id) {
        for (var myUser : users){
            if(myUser.getId() == id){
                return myUser;
            }
        }
        return null;
    }

    @Override
    public int getId() {
        return users.size() ;
    }
}
