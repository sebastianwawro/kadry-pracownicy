package pl.edu.prz.weii.kia.kadry.kadrypracownicy.criteria.lecture;

import pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture.League;
import pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture.Team;

import java.io.Serializable;
import java.util.Date;

public class PlayerSearchMultifieldCriteria implements Serializable {
    private static final long serialVersionUID = 1L;

    private Team team;
    private League league;
    private Date date;

    public PlayerSearchMultifieldCriteria(Team team, League league, Date date) {
        this.team = team;
        this.league = league;
        this.date = date;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
