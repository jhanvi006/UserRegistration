package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenTrue_ShouldReturnTrue(){
        boolean result = userRegistration.validFirstName("Jhanvi");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenTrue_ShouldReturnTrue(){
        boolean result = userRegistration.validLastName("Kanakhara");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenTrue_ShouldReturnTrue(){
        boolean result = userRegistration.validEmail("jhanvi@gmail.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenMobileNo_WhenTrue_ShouldReturnTrue(){
        boolean result = userRegistration.validMobileNo("91 7878454502");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenTrue_ShouldReturnTrue(){
        boolean result = userRegistration.validPassword("jhanviK@00");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenFalse_ShouldReturnTrue(){
        boolean result = userRegistration.validFirstName("jhanvi");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenFalse_ShouldReturnTrue(){
        boolean result = userRegistration.validLastName("jk");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenEmail_WhenFalse_ShouldReturnTrue(){
        boolean result = userRegistration.validEmail("jhanvi@.google");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenMobileNo_WhenFalse_ShouldReturnTrue(){
        boolean result = userRegistration.validMobileNo("91 78784545020");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenFalse_ShouldReturnTrue(){
        boolean result = userRegistration.validPassword("jhanvi.K@00");
        Assertions.assertFalse(result);
    }

    /*  Test cases for valid emails */
    @Test
    public void givenEmailList_WhenAllTrue_ShouldReturnTrue(){
        ArrayList<String> emailList = new ArrayList<>(Arrays.asList("abc@yahoo.com", "abc-100@yahoo.com",
                "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"));
        for (int i=0; i<emailList.size(); i++) {
            boolean result = userRegistration.validEmail(emailList.get(i));
            Assertions.assertTrue(result);
        }
    }
    /*  Test cases for invalid emails */
    @Test
    public void givenEmailList_WhenAllFalse_ShouldReturnTrue(){
        ArrayList<String> emailList = new ArrayList<>(Arrays.asList("abc", "abc@.com.my",
                "abc123@gmail.a", "abc123@.com", "abc@.com.com", ".abc@abc.com",
                "abc()*@gmail.com", "abc@%*.com", "abc@abc@gmail.com"));
        for (int i=0; i<emailList.size(); i++) {
            boolean result = userRegistration.validEmail(emailList.get(i));
            Assertions.assertFalse(result);
        }
    }
}
