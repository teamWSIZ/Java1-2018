package Zajecia14;

import java.util.Date;

public class User {

    private String name;
    private String surname;
    private Date year;
    private String password;


    public User(String name, String surname, Date year, String password) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.password = password;
    }

    public User(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.year = new Date(1867,12,0);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getYear() {
        return year;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year.getYear() +
                ", password='" + password + '\'' +
                '}';
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
