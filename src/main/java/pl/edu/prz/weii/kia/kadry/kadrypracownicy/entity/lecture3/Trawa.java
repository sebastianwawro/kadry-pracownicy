package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture3;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "trawy")
@DiscriminatorValue(value = "TRAWA")
public class Trawa extends Dekoracja {
    @Column(name = "wysokosc_trawy")
    protected String wysokoscTrawy;
}
