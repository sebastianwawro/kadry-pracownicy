package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String name;

    // odpowiednik asocjacji do klasy TeamPlayer
    @OneToMany(mappedBy = "team")
    private List<TeamPlayer> teamPlayerList;

    // odpowiednik asocjacji do klasy League
    @OneToOne
    @JoinColumn(name = "league_id")
    private League league;

    public Team(Long id, String city, String name, List<TeamPlayer> teamPlayerList, League league) {
        this.id = id;
        this.city = city;
        this.name = name;
        this.teamPlayerList = teamPlayerList;
        this.league = league;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TeamPlayer> getTeamPlayerList() {
        return teamPlayerList;
    }

    public void setTeamPlayerList(List<TeamPlayer> teamPlayerList) {
        this.teamPlayerList = teamPlayerList;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}
