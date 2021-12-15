package Chapter04.ch01;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        
        list.addElement("A");
        list.addElement("B");
        list.addElement("C");
        list.addElement("D");
        list.addElement("E");

        list.insertElement("F", 2);
        list.insertElement("Z", 0);

        list.printAll();

        System.out.println(list.removeElement(2));
        list.printAll();

    }
}