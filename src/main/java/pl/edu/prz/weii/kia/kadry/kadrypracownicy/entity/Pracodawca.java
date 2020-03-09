package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "pracodawcy")
public class Pracodawca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "regon", nullable = false)
    private Integer regon;

    @Column(nullable = false, name = "nazwa_firmy")
    private String nazwaFirmy;

    @Column(nullable = false)
    private String siedziba;

    @ManyToOne(targetEntity = Pracownik.class)
    @JoinColumn(name = "pesel", nullable = false)
    private Pracownik pracownik;

    @OneToMany(targetEntity = ListaStanowisk.class, mappedBy = "pracodawca")
    private List<ListaStanowisk> listaStanowisk;

    //wydane przez niego
    @OneToMany(targetEntity = UmowaOPrace.class, mappedBy = "pracodawca")
    private List<UmowaOPrace> umowyOPrace;

    public Integer getRegon() {
        return regon;
    }

    public void setRegon(Integer regon) {
        this.regon = regon;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public String getSiedziba() {
        return siedziba;
    }

    public void setSiedziba(String siedziba) {
        this.siedziba = siedziba;
    }

    public Pracownik getPracownik() {
        return pracownik;
    }

    public void setPracownik(Pracownik pracownik) {
        this.pracownik = pracownik;
    }

    public List<ListaStanowisk> getListaStanowisk() {
        return listaStanowisk;
    }

    public void setListaStanowisk(List<ListaStanowisk> listaStanowisk) {
        this.listaStanowisk = listaStanowisk;
    }

    public List<UmowaOPrace> getUmowyOPrace() {
        return umowyOPrace;
    }

    public void setUmowyOPrace(List<UmowaOPrace> umowyOPrace) {
        this.umowyOPrace = umowyOPrace;
    }
}
