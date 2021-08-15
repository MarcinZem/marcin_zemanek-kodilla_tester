package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Chemists", 50, 7, "Walter White"));
        users.add(new User("Sales", 25, 4648, "Jessie Pinkman"));
        users.add(new User("Manager", 34, 116, "Tuco Salamanca"));
        users.add(new User("Board", 49, 0, "Gus Firing"));
        users.add(new User("Chemists", 44, 2, "Gale Boetticher"));
        users.add(new User("Security", 57, 0, "Mike Ehrmantraut"));
        return users;
    }
}