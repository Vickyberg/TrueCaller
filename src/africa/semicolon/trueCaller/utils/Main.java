package africa.semicolon.trueCaller.utils;

import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;

import java.util.Scanner;

public class Main {
    private  static  final Scanner keyboardInput = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();

    }

    private static void mainMenu() {
        String mainMenuPrompt = """
                Welcome to True Caller
                1-> Create Account
                2-> Add Contact to user
                3-> Find Contact belonging to user
                """;

        String userInput = input(mainMenuPrompt);

        switch (userInput.charAt(0)) {
            case 1 -> createAccount();
            case 2 -> addContactToUser();
            case 3 -> findContactBelongingToUser();
        }


    }

    private static void findContactBelongingToUser() {
    }

    private static void addContactToUser() {
        AddContactRequest contactRequest = new AddContactRequest();

        contactRequest.setFirstName(input("Enter Contact's first Name: "));
        contactRequest.setLastName(input("Enter Contact's last Name: "));
        contactRequest.setPhoneNumber(input("Enter contact's phone number: "));
        contactRequest.setEmail(input("Enter Contact email: "));
        contactRequest.setUserEmail(input("Enter your email: "));
//   Todo still have a lot to do

    }

    private static void createAccount() {
        RegisterRequest request = new RegisterRequest();
        request.setFirstName(input("Enter first Name:"));
        request.setSecondName(input("Enter Second Name: "));
        request.setPhoneNumber(input("Enter phone number: "));
        request.setEmail(input("Enter email: "));
        request.setPassword(input("Enter password: "));
        mainMenu();


    }



    public static String input(String prompt) {
        System.out.println(prompt);

        return keyboardInput.nextLine();

    }

}
