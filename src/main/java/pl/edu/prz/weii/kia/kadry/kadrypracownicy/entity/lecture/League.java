package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class League {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dtype", nullable = false)
    private String type;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String sport;

    public League(Long id, String type, String name, String sport) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.sport = sport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
