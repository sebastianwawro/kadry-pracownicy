package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "sposoby_rozwiazania")
public class SposobRozwiazania {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id", nullable = false)
    private Integer id;

    @Column(nullable = true)
    private String wartosc;

    @OneToMany(targetEntity = SwiadectwoPracy.class, mappedBy = "sposobRozwiazania")
    private List<SwiadectwoPracy> swiadectwaPracy;

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

    public List<SwiadectwoPracy> getSwiadectwaPracy() {
        return swiadectwaPracy;
    }

    public void setSwiadectwaPracy(List<SwiadectwoPracy> swiadectwaPracy) {
        this.swiadectwaPracy = swiadectwaPracy;
    }
}
