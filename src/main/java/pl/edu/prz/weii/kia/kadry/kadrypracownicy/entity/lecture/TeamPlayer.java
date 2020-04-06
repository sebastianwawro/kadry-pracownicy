package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "teams_players")
public class TeamPlayer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // odpowiednik asocjacji do klasy Player
    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    // odpowiednik asocjacji do klasy Team
    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @Column(name = "valid_from", nullable = false)
    private Date validFrom;     //ta data ma być not null

    @Column(name = "valid_until")
    private Date validUntil;    //ta data może być null

    public TeamPlayer(Long id, Player player, Team team, Date validFrom, Date validUntil) {
        this.id = id;
        this.player = player;
        this.team = team;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }
}
