package Zajecia14;

import java.util.ArrayList;
import java.util.List;

public class Bilet {
    private List<Zaklad> listaZakladow;

    public Bilet() {
        listaZakladow = new ArrayList<>();
    }

    public void dodajZaklad(Zaklad z){
        if (!listaZakladow.contains(z)){
            listaZakladow.add(z);
        }
    }

    public void usunZaklad(Zaklad z){
        listaZakladow.remove(z);
    }

    public List<Zaklad> getListaZakladow() {
        return listaZakladow;
    }
}
