package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "User01", 'M', LocalDate.of(1999,12,12), 34  ));
        usersList.add(new ForumUser(2, "User02", 'M', LocalDate.of(1976,10,21), 0  ));
        usersList.add(new ForumUser(3, "User03", 'F', LocalDate.of(1988,7,4), 12  ));
        usersList.add(new ForumUser(4, "User04", 'F', LocalDate.of(1995,2,7), 112  ));
        usersList.add(new ForumUser(5, "User05", 'M', LocalDate.of(2001,4,22), 99  ));
        usersList.add(new ForumUser(6, "User06", 'F', LocalDate.of(1999,8,29), 50  ));
        usersList.add(new ForumUser(7, "User07", 'M', LocalDate.of(2006,10,17), 10  ));
        usersList.add(new ForumUser(8, "User08", 'M', LocalDate.of(1992,10,18), 15  ));
        usersList.add(new ForumUser(9, "User09", 'F', LocalDate.of(1989,8,1), 88  ));
        usersList.add(new ForumUser(10, "User10", 'M', LocalDate.of(2000,1,7), 0  ));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);
    }
}
