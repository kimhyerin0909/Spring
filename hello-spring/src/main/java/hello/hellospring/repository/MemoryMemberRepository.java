package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L; //sequence : 0,1,2 등의 key값을 생성해줌

    @Override
    public Member save(Member member) {
        member.setId(++sequence); //member의 id값을 설정
        store.put(member.getId(), member); //store라는 map에 member값을 return해줌
        return member;
    }

    @Override
    public Optional<Member> findById(long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name)) //파라미터로 넘어온 name이 같은지 확인
                .findAny(); //하나라도 찾는 거 -> 결과가 Optional로 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values()); //member들이 반환됨
    }

    public void clearStore() {
        store.clear();
    }

}
