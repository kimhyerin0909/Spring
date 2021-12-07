package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @AfterEach //각각의 테스트들이 끝날때마다 실행
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("hyerin");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        assertThat(member).isEqualTo(result); //Alt + Enter -> static import로 Assertions. 없앨 수 있음
        //Assertions.assertEquals(member, result); //result랑 member랑 같은지 확인해볼 수 있음 / result가 아닌 null이면 오류

        //System.out.println(member.getName()); //name값 확인

    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("ubin1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("ubin2");
        repository.save(member2);

        Member result = repository.findByName("ubin1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("ubin1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("ubin2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }

}
