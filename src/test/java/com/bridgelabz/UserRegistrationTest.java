package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    /*  Test for valid details  */
    @Test
    public void givenFirstName_WhenTrue_ShouldReturnTrue() throws InvalidUserException {
        String result = String.valueOf(userRegistration.validFirstName.validate("Jhanvi"));
        Assertions.assertEquals("First name is valid.", result);
    }
    @Test
    public void givenLastName_WhenTrue_ShouldReturnTrue() throws InvalidUserException {
        String result = String.valueOf(userRegistration.validLastName.validate("Kanakhara"));
        Assertions.assertEquals("Last name is valid.", result);
    }
    @Test
    public void givenEmail_WhenTrue_ShouldReturnTrue() throws InvalidUserException {
        String result = String.valueOf(userRegistration.validEmail.validate("jhanvi@gmail.com"));
        Assertions.assertEquals("Email is valid.", result);
    }
    @Test
    public void givenMobileNo_WhenTrue_ShouldReturnTrue() throws InvalidUserException {
        String result = String.valueOf(userRegistration.validMobileNo.validate("91 7878454502"));
        Assertions.assertEquals("Mobile no. is valid.", result);
    }
    @Test
    public void givenPassword_WhenTrue_ShouldReturnTrue() throws InvalidUserException {
        String result = String.valueOf(userRegistration.validPassword.validate("jhanviK@00"));
        Assertions.assertEquals("Password is valid.", result);
    }

    /*  Test for invalid details  */
    @Test
    public void givenFirstName_WhenFalse_ShouldReturnTrue()  {
        try {
            String result = String.valueOf(userRegistration.validFirstName.validate("jhanvi"));
            Assertions.assertEquals("First name is invalid.", result);
        }
        catch (InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenLastName_WhenFalse_ShouldReturnTrue() {
        try {
            String result = String.valueOf(userRegistration.validLastName.validate("jk"));
            Assertions.assertEquals("Last name is invalid.", result);
        }
        catch (InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenEmail_WhenFalse_ShouldReturnTrue() {
        try {
            String result = String.valueOf(userRegistration.validEmail.validate("jhanvi@.google"));
            Assertions.assertEquals("Email is invalid.", result);
        }
        catch (InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenMobileNo_WhenFalse_ShouldReturnTrue() {
        try {
            String result = String.valueOf(userRegistration.validMobileNo.validate("91 78784545020"));
            Assertions.assertEquals("Mobile no. is invalid.", result);
        }
        catch (InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenPassword_WhenFalse_ShouldReturnTrue() {
        try {
            String result = String.valueOf(userRegistration.validPassword.validate("jhanvi.K@00"));
            Assertions.assertEquals("Password is invalid.", result);
        }
        catch (InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }

    /*  Test cases for empty or null values */
    @Test
    public void givenFirstName_WhenNull_ShouldReturnNull()  {
        try {
            String result = String.valueOf(userRegistration.validFirstName.validate(null));
            Assertions.assertEquals(InvalidUserException.ExceptionType.NULL, result);
        }
        catch (InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenLastName_WhenEmpty_ShouldReturnEmpty() {
        try {
            String result = String.valueOf(userRegistration.validLastName.validate(""));
            Assertions.assertEquals(InvalidUserException.ExceptionType.EMPTY, result);
        }
        catch (InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenEmail_WhenEmpty_ShouldReturnEmpty() {
        try {
            String result = String.valueOf(userRegistration.validEmail.validate(""));
            Assertions.assertEquals(InvalidUserException.ExceptionType.EMPTY, result);
        }
        catch (InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }

    /*  Test cases for valid emails */
    @Test
    public void givenEmailList_WhenAllTrue_ShouldReturnTrue() throws InvalidUserException {
        ArrayList<String> emailList = new ArrayList<>(Arrays.asList("abc@yahoo.com", "abc-100@yahoo.com",
                "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"));
        for (int i = 0; i < emailList.size(); i++) {
            String result = String.valueOf(userRegistration.validEmail.validate(emailList.get(i)));
            Assertions.assertEquals("Email is valid.", result);
        }
    }

    /*  Test cases for invalid emails */
    @Test
    public void givenEmailList_WhenAllFalse_ShouldReturnTrue() {
        try {
            ArrayList<String> emailList = new ArrayList<>(Arrays.asList("abc", "abc@.com.my",
                    "abc123@gmail.a", "abc123@.com", "abc@.com.com", ".abc@abc.com",
                    "abc()*@gmail.com", "abc@%*.com", "abc@abc@gmail.com"));
            for (int i = 0; i < emailList.size(); i++) {
                String result = String.valueOf(userRegistration.validEmail.validate(emailList.get(i)));
                Assertions.assertEquals("Email is invalid.", result);
            }
        }
        catch (InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }

    /*  Parameterised Junit test  */
//    @runWith()
}

