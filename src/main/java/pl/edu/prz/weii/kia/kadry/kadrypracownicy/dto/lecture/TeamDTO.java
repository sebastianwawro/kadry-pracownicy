package pl.edu.prz.weii.kia.kadry.kadrypracownicy.dto.lecture;

import java.io.Serializable;
import java.util.List;

public class TeamDTO implements Serializable {
    private Long id;
    private String city;
    private String name;
    private List<PlayerDTO> players;
    private LeagueDTO league;

    public TeamDTO(Long id, String city, String name, List<PlayerDTO> players, LeagueDTO league) {
        this.id = id;
        this.city = city;
        this.name = name;
        this.players = players;
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

    public List<PlayerDTO> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerDTO> players) {
        this.players = players;
    }

    public LeagueDTO getLeague() {
        return league;
    }

    public void setLeague(LeagueDTO league) {
        this.league = league;
    }
}
