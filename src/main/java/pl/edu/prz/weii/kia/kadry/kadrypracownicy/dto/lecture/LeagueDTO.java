package pl.edu.prz.weii.kia.kadry.kadrypracownicy.dto.lecture;

import java.io.Serializable;

public class LeagueDTO implements Serializable {
    private Long id;
    private String type;
    private String name;
    private String sport;

    public LeagueDTO(Long id, String type, String name, String sport) {
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
