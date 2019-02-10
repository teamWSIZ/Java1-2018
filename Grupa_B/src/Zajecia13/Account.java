package Zajecia13;

import Zajecia12.User;

public class Account {

    private double cash;
    private int number;
    private boolean IsClosed;

    private User user;

    public Account(double stanKonta, int numer) {
        this.cash = stanKonta;
        this.number = numer;
    }


    public double getCash() {
        return cash;
    }

    public int getNumber() {
        return number;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isClosed() {
        return IsClosed;
    }

    public void setClosed(boolean closed) {
        if (!this.IsClosed)
            IsClosed = closed;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "cash=" + cash +
                ", number=" + number +
                ", isClosed = " + isClosed() + "}";
    }


}
