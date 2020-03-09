package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "przeniesienia_pracownikow")
public class PrzeniesieniePracownika {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false, name = "od_kiedy")
    private Date odKiedy;

    @Column(nullable = false, name = "do_kiedy")
    private Date doKiedy;

    @Column(nullable = false, name = "dodatek_wyrownawczy")
    private Float dodatekWyrownawczy;

    @ManyToOne(targetEntity = Stanowisko.class)
    @JoinColumn(name = "stanowisko", nullable = false)
    private Stanowisko stanowisko;

    @ManyToOne(targetEntity = SwiadectwoPracy.class)
    @JoinColumn(name = "nr_swiadectwa", nullable = true)
    private SwiadectwoPracy swiadectwoPracy;

    @ManyToOne(targetEntity = UmowaOPrace.class)
    @JoinColumn(name = "id_umowy", nullable = false)
    private UmowaOPrace umowaOPrace;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Float getDodatekWyrownawczy() {
        return dodatekWyrownawczy;
    }

    public void setDodatekWyrownawczy(Float dodatekWyrownawczy) {
        this.dodatekWyrownawczy = dodatekWyrownawczy;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    public SwiadectwoPracy getSwiadectwoPracy() {
        return swiadectwoPracy;
    }

    public void setSwiadectwoPracy(SwiadectwoPracy swiadectwoPracy) {
        this.swiadectwoPracy = swiadectwoPracy;
    }

    public UmowaOPrace getUmowaOPrace() {
        return umowaOPrace;
    }

    public void setUmowaOPrace(UmowaOPrace umowaOPrace) {
        this.umowaOPrace = umowaOPrace;
    }
}
