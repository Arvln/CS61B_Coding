package Linked_List1_07;

public class TestInsertItemIntoList {
    static int[] a = new int[5];
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            a[i] = i;
        }
        // List is fast to read items in it, but it's hard to insert item into it!
        int[] testList = insertNewItemIntoListA(77, 2);
        for(int k = 0; k < testList.length; k++){
            System.out.println(testList[k]);
        }
    }

    public static int[] insertNewItemIntoListA(int newItem, int location){
        int[] b = new int[a.length + 1];
        for(int i = a.length; i > location; i--){
            b[i] = a[i - 1];
        }
        for(int j = 0; j < location; j++){
            b[j] = a[j];
        }
        b[location] = newItem;
        return b;
    }
}
