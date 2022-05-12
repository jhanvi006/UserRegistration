package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        boolean result = userRegistration.validEmail("jhanvi@g");
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
}
