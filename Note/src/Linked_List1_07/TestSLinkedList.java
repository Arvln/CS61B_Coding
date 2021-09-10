package Linked_List1_07;

public class TestSLinkedList {
    public static void main(String[] args) {
        SLinkedList newLinkedList = new SLinkedList();
        System.out.println(newLinkedList.listSize);  // 0

        newLinkedList.insertFront("Milk");
        newLinkedList.insertFront("Orange juice");
        newLinkedList.insertFront("Apple juice");
        while (newLinkedList.head.next != null){
            System.out.println("new linked list size: " + newLinkedList.listSize);
            System.out.println("new linked list item: " + newLinkedList.head.item);
            newLinkedList.head = newLinkedList.head.next;
            if(newLinkedList.head.next == null){
                System.out.println("new linked list size: " + newLinkedList.listSize);
                System.out.println("new linked list item: " + newLinkedList.head.item);
            }
        }
    }
}
