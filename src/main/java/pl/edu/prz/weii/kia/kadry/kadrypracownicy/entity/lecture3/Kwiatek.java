package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture3;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "kwiatki")
@DiscriminatorValue(value = "KWIATEK")
public class Kwiatek extends Dekoracja {
    @Column(name = "gatunek_kwiatka")
    protected String gatunekKwiatka;
}
