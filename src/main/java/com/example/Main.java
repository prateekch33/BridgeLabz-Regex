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

        System.out.print("Enter a mobile number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        String[] emailSamples = { "example1@example.com", "example2@example.com", "example3@example.com" };
        String patternEmail = "^[A-Za-z0-9+_.-]+@(.+)$";

        for (String email : emailSamples) {
            boolean isValidEmail = Pattern.matches(patternEmail, email);

            if (isValidEmail) {
                System.out.println(email + " is a valid email");
            } else {
                System.out.println(email + " is an invalid email");
            }
        }

        String pattern = "^[A-Za-z]+$";
        String patternMobile = "^\\d{2} \\d{10}$";
        String patternPassword = "^(?=.*[A-Z])(?=.*\\d)(?=\\D*\\W).{8,}$";

        boolean isValidLastName = Pattern.matches(pattern, lastName);
        boolean isValidFirstName = Pattern.matches(pattern, firstName);
        boolean isValidMobileNumber = Pattern.matches(patternMobile, mobileNumber);
        boolean isValidPassword = Pattern.matches(patternPassword, password);

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
}
