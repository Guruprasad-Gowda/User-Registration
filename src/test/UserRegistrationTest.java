package com.user_registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        boolean valid = userRegistration.firstName("Guru");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnTrue() {
        boolean valid = userRegistration.firstName("guru");
        Assert.assertEquals(false, valid);
    }
}