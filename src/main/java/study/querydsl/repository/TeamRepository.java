package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.domain.Team;

/**
 * Created by kimdonghyun on 05/02/2020.
 */
public interface TeamRepository extends JpaRepository<Team, Long> {
    Team findByName(String name);
}
