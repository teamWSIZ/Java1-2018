package Zajecia12;

public class User implements Cloneable, Comparable {
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

    @Override
    public int compareTo(Object o) {
        User u = (User) o; // Rzutujemy przysłany obiekt na klase użytkownik
        if (u.name.charAt(0) < this.name.charAt(0)) { // sprawdzamy czy 1 literka imienia jest mniejsza od literki imienia w tej klasie
            return -1;//jeżeli tak to zwracamy -1 co oznacza że jest mniejsza
        } else
            return 1;//innym wypadku jest wieksza
    }
}
