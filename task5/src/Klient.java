
import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;

    public Klient(String imie, String nazwisko, String email, ArrayList<Wydarzenie> listaRezerwacji) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listaRezerwacji = new ArrayList<>();
    }

    public Klient(String imie, String nazwisko, String email) {
        this(imie, nazwisko, email, new ArrayList<>());
    }
    public Klient(String imie, String nazwisko) {
        this(imie, nazwisko, "email", new ArrayList<>());
    }

    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public ArrayList<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setListaRezerwacji(ArrayList<Wydarzenie> listaRezerwacji) {
        this.listaRezerwacji = listaRezerwacji;
    }
    public boolean dodajRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
        return true;
    }
    public void wyświetlRezerwacje() {
        if(listaRezerwacji.size()>0) {
            for (Wydarzenie wydarzenie : listaRezerwacji) {
                System.out.println(wydarzenie);
            }
        }else{
                System.out.println("Brak rezerwacji");
        }
    }
    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        if(listaRezerwacji.contains(wydarzenie)){
            listaRezerwacji.remove(wydarzenie);
        }else {
            System.out.println("Nie ma takiej rezerwacji");
        }
    }
}
