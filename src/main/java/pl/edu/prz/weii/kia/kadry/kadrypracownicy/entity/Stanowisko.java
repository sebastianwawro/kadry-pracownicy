package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "stanowiska")
public class Stanowisko {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false, name = "nazwa_stanowiska")
    private String nazwaStanowiska;

    @OneToMany(targetEntity = ListaStanowisk.class, mappedBy = "stanowisko")
    private List<ListaStanowisk> listaStanowisk;

    @OneToMany(targetEntity = PrzeniesieniePracownika.class, mappedBy = "stanowisko")
    private List<PrzeniesieniePracownika> przeniesieniaPracownika;

    @OneToMany(targetEntity = PrzydzialObowiazku.class, mappedBy = "stanowisko")
    private List<PrzydzialObowiazku> przydzialyObowiazku;

    @OneToMany(targetEntity = UmowaOPrace.class, mappedBy = "stanowisko")
    private List<UmowaOPrace> umowyOPrace;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwaStanowiska() {
        return nazwaStanowiska;
    }

    public void setNazwaStanowiska(String nazwaStanowiska) {
        this.nazwaStanowiska = nazwaStanowiska;
    }

    public List<ListaStanowisk> getListaStanowisk() {
        return listaStanowisk;
    }

    public void setListaStanowisk(List<ListaStanowisk> listaStanowisk) {
        this.listaStanowisk = listaStanowisk;
    }

    public List<PrzeniesieniePracownika> getPrzeniesieniaPracownika() {
        return przeniesieniaPracownika;
    }

    public void setPrzeniesieniaPracownika(List<PrzeniesieniePracownika> przeniesieniaPracownika) {
        this.przeniesieniaPracownika = przeniesieniaPracownika;
    }

    public List<PrzydzialObowiazku> getPrzydzialyObowiazku() {
        return przydzialyObowiazku;
    }

    public void setPrzydzialyObowiazku(List<PrzydzialObowiazku> przydzialyObowiazku) {
        this.przydzialyObowiazku = przydzialyObowiazku;
    }

    public List<UmowaOPrace> getUmowyOPrace() {
        return umowyOPrace;
    }

    public void setUmowyOPrace(List<UmowaOPrace> umowyOPrace) {
        this.umowyOPrace = umowyOPrace;
    }
}
