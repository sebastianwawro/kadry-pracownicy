package pl.edu.prz.weii.kia.kadry.kadrypracownicy.repository.lecture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture.TeamPlayer;

@Repository
public interface TeamPlayerRepository extends JpaRepository<TeamPlayer, Long> {
}
