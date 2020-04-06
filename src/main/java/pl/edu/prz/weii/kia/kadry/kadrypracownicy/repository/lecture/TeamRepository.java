package pl.edu.prz.weii.kia.kadry.kadrypracownicy.repository.lecture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture.Team;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("SELECT t FROM Team t JOIN t.league l WHERE l.sport = ?1")
    List<Team> findByLeague_Sport(String sport);

    @Query(value = "SELECT * FROM TEAM " +
            "JOIN LEAGUE ON TEAM.LEAGUE_ID = LEAGUE.ID " +
            "WHERE LEAGUE.sport = ?1", nativeQuery = true)
    List<Team> findByLeague_SportSQL(String sport);
}
