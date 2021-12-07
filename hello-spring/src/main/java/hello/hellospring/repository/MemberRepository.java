package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //저장소에 데이터가 저장됨 (메모리)
    //Optional : 만약 null이 반환될 때 Optional을 사용해 null을 감싸서 반환함
    Optional<Member> findById(long id); //id를 통해 그 id의 정보를 찾음
    Optional<Member> findByName(String name); //name을 통해 그 name의 회원 정보를 찾음
    List<Member> findAll(); //저장된 모든 회원 리스트 반환


}
