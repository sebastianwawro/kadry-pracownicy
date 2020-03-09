package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "listy_stanowisk")
public class ListaStanowisk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false, name = "data_od")
    private Date dataOd;

    @Column(nullable = true, name = "data_do")
    private Date dataDo;

    @ManyToOne(targetEntity = Stanowisko.class)
    @JoinColumn(name = "id_stanowiska", nullable = false)
    private Stanowisko stanowisko;

    @ManyToOne(targetEntity = Pracodawca.class)
    @JoinColumn(name = "regon", nullable = false)
    private Pracodawca pracodawca;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataOd() {
        return dataOd;
    }

    public void setDataOd(Date dataOd) {
        this.dataOd = dataOd;
    }

    public Date getDataDo() {
        return dataDo;
    }

    public void setDataDo(Date dataDo) {
        this.dataDo = dataDo;
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
}
