package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner sc = new Scanner(System.in);
    public static boolean validFirstName() {
        System.out.print("Enter the First Name: ");
        String name = sc.nextLine();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();

        if (r)
            System.out.println("First name is valid.");
        else
            System.out.println("First name is invalid.");
        return r;
    }
    public static boolean validLastName() {
        System.out.print("Enter the Last Name: ");
        String lastName = sc.nextLine();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lastName);
        boolean r = m.matches();

        if (r)
            System.out.println("Last name is valid.");
        else
            System.out.println("Last name is invalid.");
        return r;
    }
    public static boolean validEmail() {
        System.out.print("Enter the Email: ");
        String email = sc.nextLine();
        String regex = "^[a-z]{3}[a-zA-Z0-9.]{0,}+@bl.co+[a-z.]{0,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean r = m.matches();

        if (r)
            System.out.println("Email is valid.");
        else
            System.out.println("Email is invalid.");
        return r;
    }
    public static boolean validMobileNo() {
        System.out.print("Enter the mobile no.: ");
        String mobileNo = sc.nextLine();
        String regex = "^[1-9]{1}[0-9]{0,2}\\s[1-9]{1}[0-9]{9}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobileNo);
        boolean r = m.matches();

        if (r)
            System.out.println("Mobile no. is valid.");
        else
            System.out.println("Mobile no. is invalid.");
        return r;
    }
    public static boolean validPassword() {
        System.out.print("Enter the password: ");
        String password = sc.nextLine();
        String regex = "^(?=.*?[A-Z])([a-zA-Z0-9@._-]).{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean r = m.matches();

        if (r)
            System.out.println("Password is valid.");
        else
            System.out.println("Password is invalid.");
        return r;
    }
}
