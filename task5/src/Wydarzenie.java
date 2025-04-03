public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc;
    private int dostepneMiejsca;
    private double cena;


    public Wydarzenie(String nazwa, double cena, String data, String miejsce, int maxLiczbaMiejsc, int dostepneMiejsca) {
            this.nazwa = nazwa;
            this.cena = cena;
            this.data = data;
            this.miejsce = miejsce;
            this.maxLiczbaMiejsc = maxLiczbaMiejsc;
            this.dostepneMiejsca = dostepneMiejsca;
        }
    public Wydarzenie(String nazwa, double cena) {
        this(nazwa,cena,"data","miejsce",100,0);
    }
    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa,cena,data,"miejsce",100,0);
    }
    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this(nazwa,cena,data,miejsce,100,0);
    }
    public String getNazwa() {
        return nazwa;
    }
    public double getCena() {
        return cena;
    }
    public String getData() {
        return data;
    }
    public String getMiejsce() {
        return miejsce;
    }
    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }
    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }
    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }
    public String toString() {
        return "Wydarzenie:"+nazwa+", data: "+ data+", cena:"+cena+", miejsce: "+miejsce+", maksymalna liczba miejsc: "+maxLiczbaMiejsc+", dostepne miejsca: "+dostepneMiejsca;
    }
    public void zarezerwujMiejsce() {
        if(dostepneMiejsca > 0) {
            dostepneMiejsca--;
        }else {
            System.out.println("Brak miejsc");
        }
    }
}
