package review;

public class TestSList {
    public static void main(String[] args) {
        SList newSList = new SList();
        newSList.insertItem(" !");
        newSList.insertItem("Single Linked List");
        newSList.insertItem(" ");
        newSList.insertItem("Hello");
        while (newSList.head.next != null){
            System.out.print(newSList.head.item);
            newSList.head = newSList.head.next;
            if(newSList.head.next == null){
                System.out.print(newSList.head.item);
            }
        }
    }
}
