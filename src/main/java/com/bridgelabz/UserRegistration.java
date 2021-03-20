package com.bridgelabz;

public class UserRegistration {

    public boolean isFirstNameValid(String name) {
        String regex = "^([A-Z]{1})([a-z]{2,})$";
        return name.matches(regex);
    }

}
