import java.util.ArrayList;


public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzen = new ArrayList<>();
    private ArrayList<Klient> listaKlientow = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzen.add(wydarzenie);
    }
    public void dodajWydarzenie(String nazwa, double cena, String data){
        Wydarzenie nowe = new Wydarzenie(nazwa, cena, data);
        listaWydarzen.add(nowe);
    }
    public void dodajKlienta(Klient klient) {
        listaKlientow.add(klient);
    }
    public void dodajKlienta(String imie, String nazwisko, String email){
        Klient klient = new Klient(imie, nazwisko, email);
    }
    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        klient.dodajRezerwacje(wydarzenie);
    }
    public Wydarzenie znajdźWydarzenie(String nazwa) {
        if (listaWydarzen.isEmpty()) {
            return null;
        }else {
            for (Wydarzenie wydarzenie : listaWydarzen) {
                if (wydarzenie.getNazwa().equals(nazwa)) {
                    return wydarzenie;
                }
            }
        }
        return null;
    }
    public Klient znajdźKlientow(String nazwisko) {
        if (listaKlientow.isEmpty()) {
            return null;
        }else {
            for (Klient klient : listaKlientow) {
                if(klient.getNazwisko().equals(nazwisko)) {
                    return klient;
                }
            }
        }
        return null;
    }
    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        znajdźWydarzenie(nazwa);
        if(znajdźWydarzenie(nazwa) != null) {
            znajdźWydarzenie(nazwa).setCena(nowaCena);
        }else{
            System.out.println("Nie znaleziono wydarzenia");
        }
    }

}
