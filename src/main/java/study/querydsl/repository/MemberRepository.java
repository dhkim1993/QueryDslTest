package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl.domain.Member;

import java.util.List;

/**
 * Created by kimdonghyun on 22/01/2020.
 */
public interface MemberRepository extends JpaRepository<Member, Long> , MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {
    List<Member> findByUsername(String username);
    Member findByTeamId(Long id);
}
