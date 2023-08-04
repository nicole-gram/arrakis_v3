package com.db.grad.javaapi.model;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void testUserConstructorAndGetters() {
        // Create a User object using the constructor
        Long userId = 1L;
        String userName = "Test User";
        String userEmail = "test@example.com";
        String userRole = "Admin";

        User user = new User(userId, userName, userEmail, userRole);

        // Check if the constructor sets the fields correctly
        Assert.assertEquals(userId, user.getId());
        Assert.assertEquals(userName, user.getName());
        Assert.assertEquals(userEmail, user.getEmail());
        Assert.assertEquals(userRole, user.getRole());
    }

    @Test
    public void testSetters() {
        // Create a User object using the default constructor
        User user = new User();

        // Set the fields using setters
        Long userId = 2L;
        String userName = "Another User";
        String userEmail = "another@example.com";
        String userRole = "User";

        user.setId(userId);
        user.setName(userName);
        user.setEmail(userEmail);
        user.setRole(userRole);

        // Check if the setters update the fields correctly
        Assert.assertEquals(userId, user.getId());
        Assert.assertEquals(userName, user.getName());
        Assert.assertEquals(userEmail, user.getEmail());
        Assert.assertEquals(userRole, user.getRole());
    }
}