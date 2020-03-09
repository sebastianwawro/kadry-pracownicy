package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "swiadectwa_pracy")
public class SwiadectwoPracy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "nr_swiadectwa", nullable = false)
    private Integer nrSwiadectwa;

    @Column(nullable = false, name = "data_zakonczenia_pracy")
    private Date dataZakonczeniaPracy;

    @ManyToOne(targetEntity = SposobRozwiazania.class)
    @JoinColumn(name = "sposob_rozwiazania", nullable = false)
    private SposobRozwiazania sposobRozwiazania;

    @Column(nullable = false, name = "wykorzystane_dni_urlopow")
    private Integer wykorzystaneDniUrlopow;

    @Column(nullable = false, name = "dni_niezdolnosci_do_pracy")
    private Integer dniNiezdolnosciDoPracy;

    @OneToMany(targetEntity = PrzeniesieniePracownika.class, mappedBy = "swiadectwoPracy")
    private List<PrzeniesieniePracownika> przeniesieniaPracownika;

    @OneToMany(targetEntity = UmowaOPrace.class, mappedBy = "swiadectwoPracy")
    private List<UmowaOPrace> umowyOPrace;

    public Integer getNrSwiadectwa() {
        return nrSwiadectwa;
    }

    public void setNrSwiadectwa(Integer nrSwiadectwa) {
        this.nrSwiadectwa = nrSwiadectwa;
    }

    public Date getDataZakonczeniaPracy() {
        return dataZakonczeniaPracy;
    }

    public void setDataZakonczeniaPracy(Date dataZakonczeniaPracy) {
        this.dataZakonczeniaPracy = dataZakonczeniaPracy;
    }

    public SposobRozwiazania getSposobRozwiazania() {
        return sposobRozwiazania;
    }

    public void setSposobRozwiazania(SposobRozwiazania sposobRozwiazania) {
        this.sposobRozwiazania = sposobRozwiazania;
    }

    public Integer getWykorzystaneDniUrlopow() {
        return wykorzystaneDniUrlopow;
    }

    public void setWykorzystaneDniUrlopow(Integer wykorzystaneDniUrlopow) {
        this.wykorzystaneDniUrlopow = wykorzystaneDniUrlopow;
    }

    public Integer getDniNiezdolnosciDoPracy() {
        return dniNiezdolnosciDoPracy;
    }

    public void setDniNiezdolnosciDoPracy(Integer dniNiezdolnosciDoPracy) {
        this.dniNiezdolnosciDoPracy = dniNiezdolnosciDoPracy;
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
