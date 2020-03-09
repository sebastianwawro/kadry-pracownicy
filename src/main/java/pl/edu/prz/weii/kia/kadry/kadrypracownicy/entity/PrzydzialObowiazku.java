package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "przydzialy_obowiazkow")
public class PrzydzialObowiazku {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "id_przydzialu", nullable = false)
    private Integer idPrzydzialu;

    @Column(nullable = false, name = "od_kiedy")
    private Date odKiedy;

    @Column(nullable = true, name = "do_kiedy")
    private Date doKiedy;

    @ManyToOne(targetEntity = Stanowisko.class)
    @JoinColumn(name = "id_stanowiska", nullable = false)
    private Stanowisko stanowisko;

    @ManyToOne(targetEntity = ObowiazekPracowniczy.class)
    @JoinColumn(name = "id_obowiazku", nullable = false)
    private ObowiazekPracowniczy obowiazekPracowniczy;

    public Integer getIdPrzydzialu() {
        return idPrzydzialu;
    }

    public void setIdPrzydzialu(Integer idPrzydzialu) {
        this.idPrzydzialu = idPrzydzialu;
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

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    public ObowiazekPracowniczy getObowiazekPracowniczy() {
        return obowiazekPracowniczy;
    }

    public void setObowiazekPracowniczy(ObowiazekPracowniczy obowiazekPracowniczy) {
        this.obowiazekPracowniczy = obowiazekPracowniczy;
    }
}
