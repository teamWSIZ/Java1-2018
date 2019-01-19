package Zajecia12;

import java.util.ArrayList;
import java.util.List;

public class DataUsers {
    private List<User> userList;

    public DataUsers() {
        userList = new ArrayList();

        userList.add(new User("Jan", "Kowalski", (byte) 40, "123456"));
        userList.add(new User("Janusz", "Kowalski", (byte) 50, "654321"));
        userList.add(new User("Irena", "Kowalski", (byte) 30, "qwerty"));
    }

    public void AddUser(User user) {
        if (!userList.contains(user)) {
            userList.add(user);
        }
    }

    public void DeleteUser(User user) {
        userList.remove(user);
    }

    public void ShowUser() {
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public User FindUser(String name, String surname) {

        for (User u : userList) {
            if (u.getName().equals(name) && u.getSurname().equals(surname)) {
                return u;
            }
        }

        return null;
    }
}
