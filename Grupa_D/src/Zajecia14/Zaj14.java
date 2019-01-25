package Zajecia14;

import java.util.Date;
import java.util.List;

public class Zaj14 {
    public static void main(String[] args) {
        UserBase userBase = new UserBase();
        userBase.showUserInfo();

        User u1 = new User("Franek", "LPT", "0987654321");

        userBase.addUser(u1);
        userBase.addUser(u1); // nie doda tego samego obiektu użytkownika
        System.out.println("\n\n");
        userBase.showUserInfo();
        System.out.println("\n\n");

        User u2 = new User("Marian", "UYTTR", "qwerty");
        userBase.addUser(u2);
        userBase.showUserInfo();
        System.out.println("\n\n");

        userBase.removeUser(u2);
        userBase.removeUser(u2);// program ziała nadal ponieważ lista przy kasowaniu kasuje tylko
        //istniejące obiekty
        userBase.showUserInfo();
        System.out.println("=========\n\n");

        User u3 = userBase.findUser("Jan");
        if (u3 != null) {
            userBase.removeUser(u3);
        } else {
            System.out.println("Nie ma takiego użytkownika");
        }
        userBase.showUserInfo();
        System.out.println("\n\n");

        User u4 = userBase.findUser("Franek");
        u4.setPassword("poiuy");

        System.out.println(u4 + "\n");
        userBase.removeUser(u4);
        userBase.showUserInfo();
        System.out.println("\n\n");


        userBase.addUser(new User("Józef","OKNY","123"));
        userBase.addUser(new User("Józef","OKNY123","1231"));
        userBase.addUser(new User("Józef","OKNY321","123321"));

        List<User> us = userBase.findUsers("Józef");

        System.out.println(us);


    }
}
