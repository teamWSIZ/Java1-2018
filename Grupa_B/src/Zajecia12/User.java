package Zajecia12;

public class User implements Cloneable {
    private String name;
    private String surname;
    private byte year;
    private String password;

    public User(String name, String surname, byte year, String password) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public byte getYear() {
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
                ", year=" + year +
                '}';
    }

    public void setPassword(String password) {
        if (this.password.equals(password)) {
            System.out.println("Hasło jest takie same");
            return;
        }

        this.password = password;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public User Kopia() {
        return new User(name, surname, year, password);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
