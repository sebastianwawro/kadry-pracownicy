package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "umowy_o_prace")
public class UmowaOPrace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String nip;

    @Column(nullable = false, name = "data_zawarcia")
    private String dataZawarcia;

    @ManyToOne(targetEntity = CzasUmowy.class)
    @JoinColumn(name = "czas_umowy", nullable = false)
    private CzasUmowy czasUmowy;

    @Column(nullable = false, name = "miejsce_pracy")
    private String miejscePracy;

    @Column(nullable = false)
    private Float wymiar;

    @Column(nullable = false, name = "wynagrodzenie_wysokosc")
    private Float wynagrodzenieWysokosc;

    @Column(nullable = false, name = "wynagrodzenie_dzien_wyplaty")
    private Integer wynagrodzenieDzienWyplaty;

    @Column(nullable = false, name = "data_rozpoczecia")
    private Date dataRozpoczecia;

    @Column(nullable = true, name = "data_zakonczenia")
    private Date dataZakonczenia;

    @ManyToOne(targetEntity = Pracownik.class)
    @JoinColumn(name = "pesel", nullable = false)
    private Pracownik pracownik;

    @ManyToOne(targetEntity = SwiadectwoPracy.class)
    @JoinColumn(name = "nr_swiadectwa", nullable = true)
    private SwiadectwoPracy swiadectwoPracy;

    @ManyToOne(targetEntity = Stanowisko.class)
    @JoinColumn(name = "stanowisko", nullable = false)
    private Stanowisko stanowisko;

    @ManyToOne(targetEntity = Pracodawca.class)
    @JoinColumn(name = "regon", nullable = false)
    private Pracodawca pracodawca;

    @ManyToOne(targetEntity = Pracownik.class)
    @JoinColumn(name = "umowa_na_czas_zastepstwa", nullable = true)
    private Pracownik pracownikUmowaNaCzasZastepstwa;

    //czy na pewno many to one? i czy w tym momencie nie powinno być czegoś w drugą stronę?
    @ManyToOne(targetEntity = UmowaOPrace.class)
    @JoinColumn(name = "aneks", nullable = true)
    private UmowaOPrace aneks;

    @OneToMany(targetEntity = PrzeniesieniePracownika.class, mappedBy = "umowaOPrace")
    private List<PrzeniesieniePracownika> przeniesieniaPracownika;

    @OneToMany(targetEntity = UmowaOPrace.class, mappedBy = "aneks")
    private List<UmowaOPrace> umowyOPrace;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getDataZawarcia() {
        return dataZawarcia;
    }

    public void setDataZawarcia(String dataZawarcia) {
        this.dataZawarcia = dataZawarcia;
    }

    public CzasUmowy getCzasUmowy() {
        return czasUmowy;
    }

    public void setCzasUmowy(CzasUmowy czasUmowy) {
        this.czasUmowy = czasUmowy;
    }

    public String getMiejscePracy() {
        return miejscePracy;
    }

    public void setMiejscePracy(String miejscePracy) {
        this.miejscePracy = miejscePracy;
    }

    public Float getWymiar() {
        return wymiar;
    }

    public void setWymiar(Float wymiar) {
        this.wymiar = wymiar;
    }

    public Float getWynagrodzenieWysokosc() {
        return wynagrodzenieWysokosc;
    }

    public void setWynagrodzenieWysokosc(Float wynagrodzenieWysokosc) {
        this.wynagrodzenieWysokosc = wynagrodzenieWysokosc;
    }

    public Integer getWynagrodzenieDzienWyplaty() {
        return wynagrodzenieDzienWyplaty;
    }

    public void setWynagrodzenieDzienWyplaty(Integer wynagrodzenieDzienWyplaty) {
        this.wynagrodzenieDzienWyplaty = wynagrodzenieDzienWyplaty;
    }

    public Date getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(Date dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public Date getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(Date dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
    }

    public Pracownik getPracownik() {
        return pracownik;
    }

    public void setPracownik(Pracownik pracownik) {
        this.pracownik = pracownik;
    }

    public SwiadectwoPracy getSwiadectwoPracy() {
        return swiadectwoPracy;
    }

    public void setSwiadectwoPracy(SwiadectwoPracy swiadectwoPracy) {
        this.swiadectwoPracy = swiadectwoPracy;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    public Pracodawca getPracodawca() {
        return pracodawca;
    }

    public void setPracodawca(Pracodawca pracodawca) {
        this.pracodawca = pracodawca;
    }

    public Pracownik getPracownikUmowaNaCzasZastepstwa() {
        return pracownikUmowaNaCzasZastepstwa;
    }

    public void setPracownikUmowaNaCzasZastepstwa(Pracownik pracownikUmowaNaCzasZastepstwa) {
        this.pracownikUmowaNaCzasZastepstwa = pracownikUmowaNaCzasZastepstwa;
    }

    public UmowaOPrace getAneks() {
        return aneks;
    }

    public void setAneks(UmowaOPrace aneks) {
        this.aneks = aneks;
    }

    public List<PrzeniesieniePracownika> getPrzeniesieniaPracownika() {
        return przeniesieniaPracownika;
    }

    public void setPrzeniesieniaPracownika(List<PrzeniesieniePracownika> przeniesieniaPracownika) {
        this.przeniesieniaPracownika = przeniesieniaPracownika;
    }

    public List<UmowaOPrace> getUmowyOPrace() {
        return umowyOPrace;
    }

    public void setUmowyOPrace(List<UmowaOPrace> umowyOPrace) {
        this.umowyOPrace = umowyOPrace;
    }
}
