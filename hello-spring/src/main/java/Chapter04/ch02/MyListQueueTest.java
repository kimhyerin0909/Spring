package Chapter04.ch02;

import Chapter04.ch01.MyLinkedList;

public class MyListQueueTest {
    public static void main(String[] args) {
        MyListQueue qList = new MyListQueue();

        qList.enQueue("A");
        qList.enQueue("B");
        qList.enQueue("C");
        qList.printAll();
        System.out.println(qList.deQueue() + " dequeue");
        System.out.println(qList.deQueue() + " dequeue");
        System.out.println(qList.deQueue() + " dequeue");
        qList.printAll();
    }
}
