package Zajecia12;

public class Zajecia12a {

    public static void main(String[] args) throws Exception {

        DataUsers du = new DataUsers();
        du.ShowUser();
        System.out.println("\n\n");
        User u1 = new User("Irek", "ABC", (byte) 15, "POIUYTREWQ");
        du.AddUser(u1);
        du.ShowUser();

        User u2 = du.FindUser("Jan", "Kowalski");
        if (u2 != null) {
            du.DeleteUser(u2);
        } else {
            System.out.println("Nie ma takiego użytkownika");
        }

        User u3 = du.FindUser("Janusz", "Kowalski");
        u3.setPassword("6543210");
        System.out.println(u3.getPassword());

        User u4 = (User) u3.clone();
        u4.setSurname("POU");
        du.AddUser(u4);

        User u5 = u3.Kopia();
        u5.setSurname("YTRRE");
        du.AddUser(u5);
        du.AddUser(u5); //Nie doda ponieważ jest sprawdzenie czy już jest bazie

        System.out.println("\n\n");
        du.ShowUser();
    }
}
