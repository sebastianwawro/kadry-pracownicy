package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "czasy_umow")
public class CzasUmowy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String wartosc;

    @OneToMany(targetEntity = UmowaOPrace.class, mappedBy = "czasUmowy")
    private List<UmowaOPrace> umowyOPrace;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWartosc() {
        return wartosc;
    }

    public void setWartosc(String wartosc) {
        this.wartosc = wartosc;
    }

    public List<UmowaOPrace> getUmowyOPrace() {
        return umowyOPrace;
    }

    public void setUmowyOPrace(List<UmowaOPrace> umowyOPrace) {
        this.umowyOPrace = umowyOPrace;
    }
}
