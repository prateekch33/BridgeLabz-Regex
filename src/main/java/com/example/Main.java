package com.example;

import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter a last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter an email: ");
        String email = scanner.nextLine();

        System.out.print("Enter a mobile number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        boolean isValidFirstName = isValidFirstName(firstName);
        boolean isValidLastName = isValidLastName(lastName);
        boolean isValidEmail = isValidEmail(email);
        boolean isValidMobileNumber = isValidMobileNumber(mobileNumber);
        boolean isValidPassword = isValidPassword(password);

        if (isValidFirstName) {
            System.out.println("Valid first name");
        } else {
            System.out.println("Invalid first name");
        }
        if (isValidLastName) {
            System.out.println("Valid last name");
        } else {
            System.out.println("Invalid last name");
        }
        if (isValidEmail) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
        if (isValidMobileNumber) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }
        if (isValidPassword) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

        scanner.close();
    }

    public static boolean isValidFirstName(String string) {
        String pattern = "^[A-Za-z]+$";
        return Pattern.matches(pattern, string);
    }

    public static boolean isValidLastName(String string) {
        String pattern = "^[A-Za-z]+$";
        return Pattern.matches(pattern, string);
    }

    public static boolean isValidMobileNumber(String string) {
        String pattern = "^\\d{2} \\d{10}$";
        return Pattern.matches(pattern, string);
    }

    public static boolean isValidPassword(String password) {
        String patternPassword = "^(?=.*[A-Z])(?=.*\\d)(?=\\D*\\W).{8,}$";
        return Pattern.matches(patternPassword, password);
    }

    public static boolean isValidEmail(String string) {
        String pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(pattern, string);
    }
}
