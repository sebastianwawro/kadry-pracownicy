package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "bloki_platformy")
public class BlokPlatformy implements Serializable {
    @Id
    protected int id;

    @OneToMany(mappedBy = "podstawa")
    private List<Dekoracja> dekoracje;
}
