package pl.sw.dto;

public class GraczDTO {
    private String nazwa_gracza;
    private String pozycja;
    private String nazwa_zespolu;

    public GraczDTO(String nazwa_gracza, String pozycja, String nazwa_zespolu) {
        this.nazwa_gracza = nazwa_gracza;
        this.pozycja = pozycja;
        this.nazwa_zespolu = nazwa_zespolu;
    }

    public String getNazwa_gracza() {
        return nazwa_gracza;
    }

    public void setNazwa_gracza(String nazwa_gracza) {
        this.nazwa_gracza = nazwa_gracza;
    }

    public String getPozycja() {
        return pozycja;
    }

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }

    public String getNazwa_zespolu() {
        return nazwa_zespolu;
    }

    public void setNazwa_zespolu(String nazwa_zespolu) {
        this.nazwa_zespolu = nazwa_zespolu;
    }
}
