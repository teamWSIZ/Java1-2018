package Zajecia13;

public class Zaj13 {

    public static void main(String[] args) {
        ManagerAccount ma = new ManagerAccount();
        ma.showInfoAccount(true);
        ma.closedAccount(1234567890);
        ma.showInfoAccount(false);
    }
}
