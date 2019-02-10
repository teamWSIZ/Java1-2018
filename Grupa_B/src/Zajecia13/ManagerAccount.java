package Zajecia13;

import Zajecia12.User;

import java.util.ArrayList;
import java.util.List;

public class ManagerAccount {
    List<Account> accountList;

    public ManagerAccount() {
        this.accountList = new ArrayList<>();
        this.accountList.add(new Account(0.0, 1234567890));
        this.accountList.add(new Account(0.0, 987654321));
        this.accountList.add(new Account(0.0, 987612345));
    }

    //Dodanie nowego konta
    //Szukanie konta po nr
    //Zamkniecie konta przez oznaczenie flagi IsCosed na true
    //Przypisanie użytkownika
    //przelewy

    public void showInfoAccount(boolean onlyClosed){
        for (Account a : this.accountList){
            if (onlyClosed && a.isClosed()){
                System.out.println(a);

            }else if(!onlyClosed){
                System.out.println(a);
            }
        }
    }

    public void setUserToAccount(int number, User user){
        //poszukać konta
        //sprawdzić czy już nie jest zajęte przez innego użytkownika
        //przypisać lub inforacja że zajęte
    }

    public void addAccount(Account account) {
        if (!this.accountList.contains(account)) {
            this.accountList.add(account);
        }
    }

    public Account findAccount(int number) {
        for (Account a : this.accountList) {
            if (a.getNumber() == number) {
                return a;
            }
        }

        return null;
    }

    public void closedAccount(int number){
        Account account = this.findAccount(number);
        if (account != null){
            account.setClosed(true);
        }
    }

}
