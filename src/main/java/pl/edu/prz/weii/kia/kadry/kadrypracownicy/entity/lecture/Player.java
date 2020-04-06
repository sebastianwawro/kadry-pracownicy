package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "players")
public class Player implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String position;

    private Double salary;

    // odpowiednik asocjacji do klasy TeamPlayer
    @OneToMany(mappedBy = "player")
    private List<TeamPlayer> teamPlayerList;

    public Player(Long id, String name, String position, Double salary, List<TeamPlayer> teamPlayerList) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.teamPlayerList = teamPlayerList;
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

    public List<TeamPlayer> getTeamPlayerList() {
        return teamPlayerList;
    }

    public void setTeamPlayerList(List<TeamPlayer> teamPlayerList) {
        this.teamPlayerList = teamPlayerList;
    }
}

