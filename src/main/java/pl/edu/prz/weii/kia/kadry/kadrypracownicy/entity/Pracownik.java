package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "pracownicy")
public class Pracownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "pesel", nullable = false)
    private Integer pesel;

    @Column(nullable = false, name = "data_urodzenia")
    private String dataUrodzenia;

    @Column(nullable = false, name = "miejsce_urodzenia")
    private String miejsceUrodzenia;

    @Column(nullable = false)
    private String nip;

    @OneToOne(targetEntity = DaneOsobowe.class, mappedBy = "pracownik")
    private DaneOsobowe daneOsobowe;

    @OneToMany(targetEntity = Pracodawca.class, mappedBy = "pracownik")
    private List<Pracodawca> jakoPracodawcaList;

    @OneToMany(targetEntity = UmowaOPrace.class, mappedBy = "pracownik")
    private List<UmowaOPrace> umowyOPrace;

    @OneToMany(targetEntity = UmowaOPrace.class, mappedBy = "pracownikUmowaNaCzasZastepstwa")
    private List<UmowaOPrace> umowyOPraceNaZastepstwo;

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getMiejsceUrodzenia() {
        return miejsceUrodzenia;
    }

    public void setMiejsceUrodzenia(String miejsceUrodzenia) {
        this.miejsceUrodzenia = miejsceUrodzenia;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public DaneOsobowe getDaneOsobowe() {
        return daneOsobowe;
    }

    public void setDaneOsobowe(DaneOsobowe daneOsobowe) {
        this.daneOsobowe = daneOsobowe;
    }

    public List<Pracodawca> getJakoPracodawcaList() {
        return jakoPracodawcaList;
    }

    public void setJakoPracodawcaList(List<Pracodawca> jakoPracodawcaList) {
        this.jakoPracodawcaList = jakoPracodawcaList;
    }

    public List<UmowaOPrace> getUmowyOPrace() {
        return umowyOPrace;
    }

    public void setUmowyOPrace(List<UmowaOPrace> umowyOPrace) {
        this.umowyOPrace = umowyOPrace;
    }

    public List<UmowaOPrace> getUmowyOPraceNaZastepstwo() {
        return umowyOPraceNaZastepstwo;
    }

    public void setUmowyOPraceNaZastepstwo(List<UmowaOPrace> umowyOPraceNaZastepstwo) {
        this.umowyOPraceNaZastepstwo = umowyOPraceNaZastepstwo;
    }
}
