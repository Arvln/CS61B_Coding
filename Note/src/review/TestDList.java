package review;

public class TestDList {
    public static void main(String[] args) {
        DList newDList = new DList();
        newDList.insertItem(" !");
        newDList.insertItem("Single Linked List");
        newDList.insertItem(" ");
        newDList.insertItem("Hello");
        while (newDList.tail.prev != null){
            System.out.print(newDList.tail.item);
            newDList.tail = newDList.tail.prev;
            if(newDList.tail.prev == null){
                System.out.println(newDList.tail.item);
                System.out.print("DList size: " + newDList.size);
            }
        }
    }
}
