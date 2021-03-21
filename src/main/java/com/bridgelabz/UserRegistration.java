package com.bridgelabz;

public class UserRegistration {

    public boolean isFirstNameValid(String name) {
        String regex = "^([A-Z]{1})([a-z]{2,})$";
        return name.matches(regex);
    }

    public boolean isLastNameValid(String name) {
        String regex = "^([A-Z]{1})([a-z]{2,})$";
        return name.matches(regex);
    }

    public boolean isEmailValid(String name) {
        String regex = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
        return  name.matches(regex);
    }

    public boolean isMobileNoValid(String name) {
        String regex = "^([0-9]{2})[ ]([1-9]{1}[0-9]{9})";
        return  name.matches(regex);
    }

    public boolean isPasswordValid(String name) {
        String regex = "^[a-zA-Z0-9]{8,}$";
        return  name.matches(regex);
    }

}
