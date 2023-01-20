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

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        boolean valid = userRegistration.lastName("Prasad");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnTrue() {
        boolean valid = userRegistration.lastName("prasad");
        Assert.assertEquals(false, valid);
    }

    @Test
    public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
        boolean valid = userRegistration.emailAddress("lokeshbs619@gmail.com");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
        boolean valid = userRegistration.emailAddress("lok_sd@");
        Assert.assertEquals(false, valid);
    }
}