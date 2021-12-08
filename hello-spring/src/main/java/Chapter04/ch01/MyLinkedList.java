package Chapter04.ch01;

public class MyLinkedList {
    private MyListNode head;
    private int count; //노드가 생길 때마다 갯수 측정

    public MyLinkedList() {
        this.head = null;
        this.count = 0;
    }

    //맨 끝에 추가하는 메서드
    public void addElement(String data) {
        MyListNode newNode = new MyListNode(data); //노드 생성 후 데이터 삽입

        if(head == null) {
            head = newNode;
        }
        else {
            MyListNode temp = head; //c의 포인터 변수
            while(temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
        count++;
    }

    //중간에 삽입
    public void insertElement(String data, int position) {
        MyListNode newNode = new MyListNode(data);
        if(position < 0 || position > count) {
            System.out.println("그딴 위치 없음!");
        }
        if(position == 0) {
            newNode.link = head;
            head = newNode;
        }
        else {
            MyListNode temp = head;
            MyListNode pre = null;
            for(int i = 0; i < position; i++) {
                pre = temp;
                temp = temp.link;
            }
            pre.link = newNode;
            newNode.link = temp;
        }
        count++;
    }

    public void printAll() {
        if(count == 0) {
            System.out.println("현재 노드가 비어있습니다.");
            return;
        }
        MyListNode temp = head;
        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.link;
        }
    }
}
