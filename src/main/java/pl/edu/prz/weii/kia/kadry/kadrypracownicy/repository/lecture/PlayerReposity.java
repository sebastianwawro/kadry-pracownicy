package pl.edu.prz.weii.kia.kadry.kadrypracownicy.repository.lecture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.edu.prz.weii.kia.kadry.kadrypracownicy.criteria.lecture.PlayerSearchMultifieldCriteria;
import pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture.Player;
import pl.sw.dto.GraczDTO;

import java.util.List;

@Repository
public interface PlayerReposity extends JpaRepository<Player, Long> {

    @Query("SELECT p FROM Player p WHERE p.teams IS EMPTY")
    List<Player> findAll();

    @Query("SELECT DISTINCT p FROM Player p WHERE p.salary = ?1")
    List<Player> findBySalary(Double salary);

    @Query("SELECT p FROM Player p WHERE p.teams IS NOT EMPTY")
    List<Player> findByTeamPlayerListIsNotEmpty();

    @Query("SELECT p FROM Player p WHERE p.teams IS EMPTY")
    List<Player> findByTeamPlayerListIsEmpty();

    @Query("SELECT p FROM Player p JOIN p.teams t")
    List<Player> findAllWithJoin();

    @Query(value = "SELECT * FROM PLAYER", nativeQuery = true)
    List<Player> findAllSQL();

    @Query(value = "SELECT DISTINCT * FROM PLAYER WHERE salary = ?1", nativeQuery = true)
    List<Player> findBySalarySQL(Double salary);

    @Query(value = "SELECT * FROM PLAYER WHERE teams IS NOT EMPTY", nativeQuery = true)
    List<Player> findByTeamPlayerListIsNotEmptySQL();

    @Query(value = "SELECT * FROM PLAYER WHERE teams IS EMPTY", nativeQuery = true)
    List<Player> findByTeamPlayerListIsEmptySQL();

    @Query(value = "SELECT * FROM PLAYER " +
            "JOIN TEAM_PLAYER ON PLAYER.ID = TEAM_PLAYER.PLAYER_ID " +
            "JOIN TEAM ON TEAM_PLAYER.TEAM_ID = TEAM.ID", nativeQuery = true)
    List<Player> findAllWithJoinSQL();

    @Query("SELECT p FROM Player p " +
            "JOIN p.teamPlayerList pt " +
            "JOIN pt.team t " +
            "JOIN t.league l WHERE " +
            "t = :#{#criteria.team} AND " +
            "l = :#{#criteria.league} AND " +
            ":#{#criteria.date} BETWEEN pt.validFrom AND pt.validUntil")
    List<Player> findByMultifieldCriteria(@Param("criteria") PlayerSearchMultifieldCriteria criteria);

    @Query("SELECT new pl.sw.dto.GraczDTO(p.name, p.position, t.name) FROM Player p " +
            "JOIN p.teamPlayerList pt " +
            "JOIN pt.team t " +
            "JOIN t.league l WHERE " +
            "t = :#{#criteria.team} AND " +
            "l = :#{#criteria.league} AND " +
            ":#{#criteria.date} BETWEEN pt.validFrom AND pt.validUntil")
    List<GraczDTO> findByMultifieldCriteriaAndConvertToDto(@Param("criteria") PlayerSearchMultifieldCriteria criteria);
}
