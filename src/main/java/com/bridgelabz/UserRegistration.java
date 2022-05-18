package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserDetailsValidationFI {
    String validate(String x) throws InvalidUserException;
}
public class UserRegistration {
    UserDetailsValidationFI validFirstName = firstName -> {
        if (firstName == null) {
            throw new InvalidUserException(InvalidUserException.ExceptionType.NULL, "Input can't be Null");
        } else if (firstName.length() == 0) {
            throw new InvalidUserException(InvalidUserException.ExceptionType.EMPTY, "Invalid Input");
        } else {
            try {
                String regex = "^[A-Z]{1}[a-z]{2,}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher m = pattern.matcher(firstName);
                boolean r = m.matches();
                if (r)
                    return "First name is valid.";
                else
                    throw new InvalidUserException("First name is invalid.");
            }
            catch (Exception e){
                throw new InvalidUserException("Invalid first name.");
            }
        }
    };
    UserDetailsValidationFI validLastName = lastName -> {
        if (lastName == null) {
            throw new InvalidUserException(InvalidUserException.ExceptionType.NULL, " Input can't be Null");
        } else if (lastName.length() == 0) {
            throw new InvalidUserException(InvalidUserException.ExceptionType.EMPTY, "Invalid Input");
        } else {
            try {
                String regex = "^[A-Z]{1}[a-z]{2,}$";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(lastName);
                boolean r = m.matches();
                if (r)
                    return "Last name is valid.";
                else
                    throw new InvalidUserException("Last name is invalid.");
                }
            catch (Exception e){
                throw new InvalidUserException("Invalid last name.");
            }
        }
    };
    UserDetailsValidationFI validEmail = email -> {
        if (email == null) {
            throw new InvalidUserException(InvalidUserException.ExceptionType.NULL, " Input can't be Null");
        } else if (email.length() == 0) {
            throw new InvalidUserException(InvalidUserException.ExceptionType.EMPTY, "Invalid Input");
        } else {
            try {
                String regex = "^[a-z]{3}[a-zA-Z0-9-.+_]{0,}+@[a-zA-Z0-9]{1,}(?:\\.([a-zA-Z0-9-]+){2,})*$";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(email);
                boolean r = m.matches();
                if (r)
                    return "Email is valid.";
                else
                    throw new InvalidUserException("Email is invalid.");
            }
            catch (Exception e){
                throw new InvalidUserException("Invalid email.");
            }
        }
    };
    UserDetailsValidationFI validMobileNo = mobileNo -> {
        if (mobileNo == null) {
            throw new InvalidUserException(InvalidUserException.ExceptionType.NULL, " Input can't be Null");
        } else if (mobileNo.length() == 0) {
            throw new InvalidUserException(InvalidUserException.ExceptionType.EMPTY, "Invalid Input");
        } else {
            try {
                String regex = "^[1-9]{1}[0-9]{0,2}\\s[1-9]{1}[0-9]{9}$";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(mobileNo);
                boolean r = m.matches();
                if (r)
                    return "Mobile no. is valid.";
                else
                    throw new InvalidUserException("Mobile no. is invalid.");
            }
            catch (Exception e){
                throw new InvalidUserException("Invalid Mobile no.");
            }
        }
    };
    UserDetailsValidationFI validPassword = password -> {
        if (password == null) {
            throw new InvalidUserException(InvalidUserException.ExceptionType.NULL, " Input can't be Null");
        } else if (password.length() == 0) {
            throw new InvalidUserException(InvalidUserException.ExceptionType.EMPTY, "Invalid Input");
        } else {
            try {
                String regex = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[a-z])(?!.*[<>`])" +
                        "(?=[^.,:;'!@#$%^&*_]*[.,:;'!@#$%^&*_][^.,:;'!@#$%^&*_]*$).{8,}$";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(password);
                boolean r = m.matches();
                if (r)
                    return "Password is valid.";
                else
                    throw new InvalidUserException("Password is invalid.");
            }
            catch (Exception e){
                throw new InvalidUserException("Invalid password.");
            }
        }
    };
}

