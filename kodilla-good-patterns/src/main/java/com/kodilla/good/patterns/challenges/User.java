package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private Integer userId;

    public User(String name, String surname, Integer userId) {
        this.name = name;
        this.surname = surname;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getName().equals(user.getName()) &&
                getSurname().equals(user.getSurname()) &&
                getUserId().equals(user.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getUserId());
    }
}
