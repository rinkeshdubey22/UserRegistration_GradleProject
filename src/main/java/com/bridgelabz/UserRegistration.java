package com.bridgelabz;

@FunctionalInterface
interface lambdaValidationFun {
    boolean matchPatternLambda(String input, String pattern);
}

public class UserRegistration {

    lambdaValidationFun dd = (pattern, input) ->  pattern.matches(input);

    public boolean isFirstNameValid(String name) {
        String regex = "^([A-Z]{1})([a-z]{2,})$";
        return dd.matchPatternLambda(name,regex);
    }

    public boolean isLastNameValid(String name) {
        String regex = "^([A-Z]{1})([a-z]{2,})$";
        return dd.matchPatternLambda(name,regex);
    }

    public boolean isEmailValid(String name) {
        String regex = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
        return dd.matchPatternLambda(name,regex);
    }

    public boolean isMobileNoValid(String name) {
        String regex = "^([0-9]{2})[ ]([1-9]{1}[0-9]{9})";
        return dd.matchPatternLambda(name,regex);
    }

    public boolean isPasswordValid(String name) {
        String regex = "^[A-Z]{1}+[a-z]{4,}+[0-9]{1,}+[@$!%*#?&]{1,}";
        return dd.matchPatternLambda(name,regex);
    }

    public String isEntryValid(boolean validate) {
        if (validate) {
            return "Happy";
        } else {
            return "Sad";
        }

    }

}
