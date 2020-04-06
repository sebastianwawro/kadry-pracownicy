package pl.edu.prz.weii.kia.kadry.kadrypracownicy.dto.lecture;

import java.io.Serializable;
import java.util.List;

public class PlayerDTO implements Serializable {
    private Long id;
    private String name;
    private String position;
    private Double salary;
    private List<TeamDTO> teams;

    public PlayerDTO(Long id, String name, String position, Double salary, List<TeamDTO> teams) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.teams = teams;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<TeamDTO> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamDTO> teams) {
        this.teams = teams;
    }
}
