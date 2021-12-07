package hello.hellospring.domain;

public class Member {
    private long id; //데이터를 구분하기 위해서 시스템이 정하는 아이디
    private String name;

    //get : 값을 return받게 해주는 메소드
    //set : 값을 저장(셋팅)하게 유도하는 메소드

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
