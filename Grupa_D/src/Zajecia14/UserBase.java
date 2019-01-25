package Zajecia14;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBase {

    private List<User> userList;

    public UserBase() {
        userList = new ArrayList<>();
        User u1 = new User("Jan", "Kowalski", new Date(1992, 04, 12), "123456");
        userList.add(u1);
        userList.add(new User("Antoś", "ASD", new Date(1990, 05, 28), "654321"));
    }

    public void showUserInfo() {
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void addUser(User user) {
        if (!userList.contains(user)) {
            userList.add(user);
        }
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public User findUser(String name) {
        for (User user : userList) {
            if (user.getName().equals(name)) {
                return user;
            }
        }

        return null;
    }

    public List<User> findUsers(String name){
        List<User> users = new ArrayList<>();
        for (User user : userList) {
            if (user.getName().equals(name)) {
                users.add(user);
            }
        }
        return users;
    }
}
