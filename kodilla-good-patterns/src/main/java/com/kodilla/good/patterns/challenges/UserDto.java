package com.kodilla.good.patterns.challenges;

import java.util.HashSet;
import java.util.Set;

public class UserDto {
    private Set<User> userSet = new HashSet<>();

    public void addClient (User user) {
        int n = userSet.size();
        userSet.add(user);
        if (n == userSet.size()) {
            System.out.println("User is in database: " + user + "");
        }
    }
    boolean checkAvailabilityOfCustomer (User user) {
        if (userSet.contains(user)) {
            return true;
        } else {
            System.out.println("User isn't in database (UserDto)");
            return false;
        }
    }
}
