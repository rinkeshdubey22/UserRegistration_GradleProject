package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userregistration = new UserRegistration();
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

}
