package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;

public class UserRegistrationTest {
    UserRegistration userregistration = new UserRegistration();
    //Test Cases For First Name Validation
    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True () {
        try {
            boolean result = userregistration.isFirstNameValid("Rinkesh");
            Assertions.assertTrue(result);
        }
        catch(UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void givenFirstName_WhenFirstNameInLowerCase_ShouldReturn_False () {
        try {
            boolean result = userregistration.isFirstNameValid("rinkesh");
            Assertions.assertFalse(result);
        }
        catch(UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveMinThreeLetter_ShouldReturn_True () {
        try {
            boolean result = userregistration.isFirstNameValid("Rin");
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveLessThanThreeLetter_ShouldReturn_False () {
        try {
            boolean result = userregistration.isFirstNameValid("Ri");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }
    //Test Cases For Last Name Validation
    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True () {
        try {
            boolean result = userregistration.isLastNameValid("Dubey");
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }

    @Test
    public void givenLastName_WhenLastNameInLowerCase_ShouldReturn_False () {
        try {
            boolean result = userregistration.isLastNameValid("dubey");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }

    @Test
    public void givenLastName_WhenLastNameHaveMinThreeLetter_ShouldReturn_True () {
        try {
            boolean result = userregistration.isLastNameValid("Dub");
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }

    @Test
    public void givenLastName_WhenLastNameHaveLessThanThreeLetter_ShouldReturn_False () {
        try {
            boolean result = userregistration.isLastNameValid("Du");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }

    //Test Cases For Email Id Validation
    @Test
    public void givenEmail_WhenEmailContainMinimumTwoLetterAfterDot_ShouldReturn_True() {
        try {
            boolean result = userregistration.isEmailValid("abc@gmail.co");
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }

    @Test
    public void givenEmail_WhenEmailContainOnlyOneLetterAfterDot_ShouldReturn_False() {
        try {
            boolean result = userregistration.isEmailValid("abc@gmail.c");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }

    @Test
    public void givenEmail_WhenEmailStartsWithCapitalLetter_ShouldReturn_True() {
        try {
            boolean result = userregistration.isEmailValid("rinkeshdubey2@gmail.com");
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }

    //Test Cases for MobileNo Validation
    @Test
    public void givenMobileNo_WhenMobileNoIsFollowedByCountryCode_ShouldReturn_True() {
        try {
            boolean result = userregistration.isMobileNoValid("91 7753907973");
            Assertions.assertTrue( result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void givenMobileNo_WhenMobileNoIsNotFollowedByCountryCode_ShouldReturn_False() {
        try {
            boolean result = userregistration.isMobileNoValid("7753907973");
            Assertions.assertFalse( result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void givenMobileNo_WhenMobileNoIsNotTenDigit_ShouldReturn_False() {
        try {
            boolean result = userregistration.isMobileNoValid("91 775390");
            Assertions.assertFalse( result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void givenMobileNo_WhenMobileNoIsNotFollowedSpaceBetweenCountryCode_ShouldReturn_False() {
        try {
            boolean result = userregistration.isMobileNoValid("917753907973");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }

    //Test Cases for Password Validation
    @Test
    public void givenPassword_WhenPasswordHaveMinimum8CharactersAndHaveAtLeastOneUpperCaseAndHaveAtLeast1DigitAndHave1SpecialCharacter_ShouldReturn_True() {
        try {
            boolean result = userregistration.isPasswordValid("Rinkesh123@");
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.type);
        }

    }

    @Test
    public void givenPassword_WhenPasswordHaveMinimum8CharactersandDoNotHaveUpperCaseAndHaveAtLeast1DigitAndHave1SpecialCharacter_ShouldReturn_False() {
        try {
            boolean result = userregistration.isPasswordValid("rinkesh123@");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void givenPassword_WhenPasswordHaveLessThan8CharactersAndHaveOneUpperCaseAndHaveAtLeastOneDigitAndHave1SpecialCharacter_ShouldReturn_False() {
        try {
            boolean result = userregistration.isPasswordValid("Rkes1@");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void givenPassword_WhenPasswordHaveMinimum8CharactersAndHaveOneUpperCaseAndHaveAtLeastOneDigitAndDoNotHaveOneSpecialCharacter_ShouldReturn_False() {
        try {
            boolean result = userregistration.isPasswordValid("Rinkeshd");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void whenEntrySuccessfull_ShouldReturn_True() {
        boolean isValid = true;
        String validateEntry = userregistration.isEntryValid(isValid);
        Assertions.assertEquals("Happy", validateEntry);
    }

    @Test
    public void whenEntryUnSuccessfull_ShouldReturn_False() {
        boolean isValid = false;
        String validateEntry = userregistration.isEntryValid(isValid);
        Assertions.assertEquals("Sad", validateEntry);
    }
}
