package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "obowiazki_pracownicze")
public class ObowiazekPracowniczy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String rola;

    @OneToMany(targetEntity = PrzydzialObowiazku.class, mappedBy = "obowiazekPracowniczy")
    private List<PrzydzialObowiazku> przydzialyObowiazku;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    public List<PrzydzialObowiazku> getPrzydzialyObowiazku() {
        return przydzialyObowiazku;
    }

    public void setPrzydzialyObowiazku(List<PrzydzialObowiazku> przydzialyObowiazku) {
        this.przydzialyObowiazku = przydzialyObowiazku;
    }
}
