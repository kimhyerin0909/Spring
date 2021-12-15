package Chapter04.ch02;

import Chapter04.ch01.MyLinkedList;
import Chapter04.ch01.MyListNode;

public class MyListQueue extends MyLinkedList implements IQueue{
    MyListNode front;
    MyListNode rear;

    public MyListQueue() {
        front = null;
        rear = null;
    }

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if(front == null && rear == null) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }
        else {
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(data + " enqueue");
    }

    @Override
    public String deQueue() {
        if(front == null && rear == null) {
            System.out.println("비어있는뎅");
            return null;
        }
        String data = front.getData();
        front = front.link;
        if(front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public void printAll() {
        MyListNode temp = front;
        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.link;
        }
        System.out.println("");
    }
}
