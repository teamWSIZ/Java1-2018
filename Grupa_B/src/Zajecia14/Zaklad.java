package Zajecia14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zaklad {
    private List<Integer> liczbyUzytkownika;

    public Zaklad() {
        this.liczbyUzytkownika = Losowa.losujLiczby();
    }

    public List<Integer> getLiczbyUzytkownika() {
        return liczbyUzytkownika;
    }


}
