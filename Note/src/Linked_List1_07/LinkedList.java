package Linked_List1_07;

public class LinkedList {
    public int item;
    public LinkedList next;

    public LinkedList(int item, LinkedList next){
        this.item = item;
        this.next = next;
    }

    public LinkedList(int item){
        this(item, null);
    }

    public void insertNewItemIntoLinkedList(int item){
        LinkedList newItem = new LinkedList(item);
        LinkedList currentPointer = this.next;
        this.next = newItem;
        newItem.next = currentPointer;
    }

    public static void main(String[] args) {
        // Linked list is hard to read item into it, but it's very easy to insert item!
        LinkedList l1 = new LinkedList(1);
        LinkedList l2 = new LinkedList(2);
        LinkedList l3 = new LinkedList(3);
        LinkedList l4 = new LinkedList(4);
        LinkedList l5 = new LinkedList(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        l2.insertNewItemIntoLinkedList(77);

        LinkedList node = l1;
        while (node.next != null){
            System.out.println(node.item);
            node = node.next;
        }
        System.out.println(node.item);

        // So, We want compromise list and linked list try to find out
        // have to build DS to solve the question we face!
    }
}
