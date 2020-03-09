package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "dane_osobowe")
public class DaneOsobowe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String imie;

    @Column(nullable = false)
    private String nazwisko;

    @Column(nullable = false)
    private String telefon;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false, name = "nr_dowodu_osobistego")
    private String nrDowoduOsobistego;

    @Column(nullable = false)
    private String ulica;

    @Column(nullable = false, name = "nr_domu")
    private String nrDomu;

    @Column(nullable = false, name = "nr_lokalu")
    private Integer nrLokalu;

    @Column(nullable = false)
    private Integer kod;

    @Column(nullable = false)
    private String miejscowosc;

    @OneToOne(targetEntity = Pracownik.class)
    @JoinColumn(name = "pesel", nullable = false)
    private Pracownik pracownik;

    @Column(nullable = false, name = "od_kiedy")
    private Date odKiedy;

    @Column(nullable = true, name = "do_kiedy")
    private Date doKiedy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNrDowoduOsobistego() {
        return nrDowoduOsobistego;
    }

    public void setNrDowoduOsobistego(String nrDowoduOsobistego) {
        this.nrDowoduOsobistego = nrDowoduOsobistego;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public Integer getNrLokalu() {
        return nrLokalu;
    }

    public void setNrLokalu(Integer nrLokalu) {
        this.nrLokalu = nrLokalu;
    }

    public Integer getKod() {
        return kod;
    }

    public void setKod(Integer kod) {
        this.kod = kod;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public Pracownik getPracownik() {
        return pracownik;
    }

    public void setPracownik(Pracownik pracownik) {
        this.pracownik = pracownik;
    }

    public Date getOdKiedy() {
        return odKiedy;
    }

    public void setOdKiedy(Date odKiedy) {
        this.odKiedy = odKiedy;
    }

    public Date getDoKiedy() {
        return doKiedy;
    }

    public void setDoKiedy(Date doKiedy) {
        this.doKiedy = doKiedy;
    }
}
