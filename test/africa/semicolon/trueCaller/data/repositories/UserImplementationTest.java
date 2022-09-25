//package africa.semicolon.trueCaller.data.repositories;
//
//import africa.semicolon.trueCaller.data.models.User;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class UserImplementationTest {
//
//    @Test
//    void testThatUserCanBeCreated_And_ContactCanBeSaved_And_ContactCanBeFoundById(){
//        UserRepository userRepository = new UserRepositoryImpl();//user creation
//        User user = new User();
//        user.setFirstName("Ola");
//        user.setLastName("Victor");
//        user.setPhoneNumber("935322");
//        user.setEmail("Ooen31@gmail.com");
//        userRepository.save(user);//save user
//        assertEquals(1,userRepository.count());
//
//        //to find the user saved by using its id
//        User userSaved = userRepository.findById(1);//find by id
//       assertEquals("Victor",userSaved.getLastName());
//    }
//
//    @Test
//    void testThatContactCanBeDeleted_FindById(){
//        UserRepository userRepository = new UserRepositoryImpl();//user creation
//        User user = new User();
//        user.setFirstName("Ola");
//        user.setLastName("Victor");
//        user.setPhoneNumber("935322");
//        user.setEmail("Ooen31@gmail.com");
//        userRepository.save(user);//save user
//
//        User user2 = new User();
//        user2.setFirstName("Ol");
//        user2.setLastName("Vicor");
//        user2.setPhoneNumber("935322");
//        user2.setEmail("Oon31@gmail.com");
//        userRepository.save(user2);
//
//        assertEquals(2,userRepository.count());
//        userRepository.delete(1 );
//        assertEquals(1,userRepository.count());
//
//
//    }
//    @Test
//    void findAllContacts_WithIdTest(){
//        UserRepository userRepository = new UserRepositoryImpl();//user creation
//        User user = new User();
//        user.setFirstName("Ola");
//        user.setLastName("Victor");
//        user.setPhoneNumber("935322");
//       user.setEmail("Ooen31@gmail.com");
//        userRepository.save(user);//save user
//        assertEquals(1,userRepository.count());
//
//        User newUser = new User();
//        user.setFirstName("Ope");
//        user.setFirstName("Dapo");
//        user.setPhoneNumber("935322");
//        user.setEmail("Oerrwj31@gmail.com");
//        userRepository.save(newUser);//save user
//        userRepository.findAllUsers();
//        assertEquals(2,userRepository.count());
//
//
//    }
//
//}
