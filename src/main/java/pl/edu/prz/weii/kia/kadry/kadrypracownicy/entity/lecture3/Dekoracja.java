package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture3;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dekoracje")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typ", discriminatorType = DiscriminatorType.STRING)
public class Dekoracja implements Serializable {
    @Id
    protected int id;

    @ManyToOne
    @JoinColumn(name = "podstawa_id", nullable = false)
    protected BlokPlatformy podstawa;
}

/*
Table dekoracje as D {
  id int [pk, increment]
  gatunek_kwiatka varchar
  wysokosc_trawy int
  typ varchar [not null]
  podstawa_id int [ref: > BP.id]
}

Table bloki_platformy as BP {
  id int [pk, increment]
}
 */