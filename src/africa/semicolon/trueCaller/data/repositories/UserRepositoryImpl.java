package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

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
        users.remove(user);
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
        for (User myUser : users){
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

    @Override
    public User findByUSerName(String username) {
        for(User user : users){
            if(user.getUsername().equalsIgnoreCase(username)){
                return  user;
            }
        }
        return null;
    }

    @Override
    public User findByEmail(String email) {
        for(User foundUser: users) {
            if (foundUser.getEmail().equalsIgnoreCase(email)) {
                return foundUser;
            }
        }
        return null;
    }
}
