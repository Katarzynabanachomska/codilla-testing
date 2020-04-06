package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsNumber;

    public ForumUser(int userID, String userName, char sex, LocalDate birthDate, int postsNumber) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsNumber = postsNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (getUserID() != forumUser.getUserID()) return false;
        if (getSex() != forumUser.getSex()) return false;
        if (getPostsNumber() != forumUser.getPostsNumber()) return false;
        if (!getUserName().equals(forumUser.getUserName())) return false;
        return getBirthDate().equals(forumUser.getBirthDate());
    }

    @Override
    public int hashCode() {
        int result = getUserID();
        result = 27 * result + getUserName().hashCode();
        result = 27 * result + (int) getSex();
        result = 27 * result + getBirthDate().hashCode();
        result = 27 * result + getPostsNumber();
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
