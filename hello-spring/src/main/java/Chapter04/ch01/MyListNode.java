package Chapter04.ch01;

public class MyListNode {
    private String data;
    public MyListNode link; //값을 가지지 않고 참조만 할 수 있음

    public MyListNode() {
        this.data = null;
        this.link = null;
    }

    //매개변수로 데이터를 준 경우
    public MyListNode(String data) {
        this.data = data;
        this.link = null;
    }

    //매개변수로 데이터와 링크를 준 경우
    public MyListNode(String data, MyListNode link) {
        this.data = data;
        this.link = link;
    }

    public String getData() {
        return data;
    }
}
