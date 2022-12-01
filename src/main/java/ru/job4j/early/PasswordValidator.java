package ru.job4j.early;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class PasswordValidator {
    
    private static final String[] BAD_PWD = {"qwerty", "12345", "password", "admin", "user"};
    
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (!isContainLowercaseLetter(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!isContainUppercaseLetter(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!isContainDigit(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isContainSpecialSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        for (String str : BAD_PWD) {
            if (password.toLowerCase().contains(str)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: "
                        + "qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
    
    private static boolean isContainLowercaseLetter(String password) {
        for (char ch : password.toCharArray()) {
            if (isLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean isContainUppercaseLetter(String password) {
        for (char ch : password.toCharArray()) {
            if (isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean isContainDigit(String password) {
        for (char ch : password.toCharArray()) {
            if (isDigit(ch)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean isContainSpecialSymbol(String password) {
        for (char ch : password.toCharArray()) {
            if (!isLetterOrDigit(ch)) {
                return true;
            }
        }
        return false;
    }
    
}
