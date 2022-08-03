package africa.semicolon.trueCaller;

import africa.semicolon.trueCaller.controllers.UserController;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.AllContactResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
@SpringBootApplication
public class Main {

    private  static  final Scanner keyboardInput = new Scanner(System.in);
    private static UserController userController = new UserController();
    public static void main(String[] args) {
       SpringApplication.run(Main.class, args);
        mainMenu();

    }

    private static void mainMenu() {
        String mainMenuPrompt = """
                Welcome to True Caller
                1 -> Create Account
                2 -> Add Contact to user
                3 -> Find Contact belonging to user
                """;



        switch (input(mainMenuPrompt)) {
            case "1" -> createAccount();
            case "2" -> addContactToUser();
            case "3"-> findContactBelongingToUser();
        }


    }

    private static void findContactBelongingToUser() {
        var contacts = userController.findContactBelongingTo(input("Enter your email: "));
        for(AllContactResponse contact: contacts) {
            System.out.println(contact);
        }
        mainMenu();
    }

    private static void addContactToUser() {
        AddContactRequest contactRequest = new AddContactRequest();

        contactRequest.setFirstName(input("Enter Contact's first Name: "));
        contactRequest.setLastName(input("Enter Contact's last Name: "));
        contactRequest.setPhoneNumber(input("Enter contact's phone number: "));
        contactRequest.setEmail(input("Enter Contact email: "));
        contactRequest.setUserEmail(input("Enter your email: "));
        userController.addContact(contactRequest);
        mainMenu();

    }

    private static void createAccount() {
        RegisterRequest request = new RegisterRequest();
        request.setFirstName(input("Enter first Name:"));
        request.setLastName(input("Enter Last Name: "));
        request.setPhoneNumber(input("Enter phone number: "));
        request.setEmail(input("Enter email: "));
        request.setPassword(input("Enter password: "));
        request.setUsername(input("Enter username: "));
        userController.registerUser(request);
        mainMenu();


    }



    public static String input(String prompt) {
        System.out.println(prompt);

        return keyboardInput.nextLine();

    }

}
