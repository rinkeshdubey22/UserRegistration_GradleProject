package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userregistration = new UserRegistration();
    //Test Cases For First Name
    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True () {
        boolean result = userregistration.isFirstNameValid("Rinkesh");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameInLowerCase_ShouldReturn_False () {
        boolean result = userregistration.isFirstNameValid("rinkesh");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveMinThreeLetter_ShouldReturn_True () {
        boolean result = userregistration.isFirstNameValid("Rin");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveLessThanThreeLetter_ShouldReturn_False () {
        boolean result = userregistration.isFirstNameValid("Ri");
        Assertions.assertFalse(result);
    }
    //Test Cases For Last Name
    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True () {
        boolean result = userregistration.isLastNameValid("Dubey");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLastNameInLowerCase_ShouldReturn_False () {
        boolean result = userregistration.isLastNameValid("dubey");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenLastNameHaveMinThreeLetter_ShouldReturn_True () {
        boolean result = userregistration.isLastNameValid("Dub");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLastNameHaveLessThanThreeLetter_ShouldReturn_False () {
        boolean result = userregistration.isLastNameValid("Du");
        Assertions.assertFalse(result);
    }

    //Test Cases For Email Id
    @Test
    public void givenEmail_WhenEmailContainMinimumTwoLetterAfterDot_ShouldReturn_True()
    {
        boolean result = userregistration.isEmailValid("abc@gmail.co");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenEmailContainOnlyOneLetterAfterDot_ShouldReturn_False()
    {
        boolean result = userregistration.isEmailValid("abc@gmail.c");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenEmailStartsWithCapitalLetter_ShouldReturn_True()
    {
        boolean result = userregistration.isEmailValid("Rinkesh@gmail.com");
        Assertions.assertTrue(result);
    }



}
