package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture3;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dekoracje")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Dekoracja implements Serializable {
    @Id
    protected int id;

    @ManyToOne
    @JoinColumn(name = "podstawa_id", nullable = false)
    protected BlokPlatformy podstawa;
}
