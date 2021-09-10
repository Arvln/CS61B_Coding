package Array2_06;

public class TestArray {
    public static void main(String[] args) {
        // Object array will not create Object for you, only have null means there are references point to nothing
        String[] objectArray = new String[3];
        objectArray[0] = "Hello";
        objectArray[2] = new String();

        // break jump out of switch or loop statement
        // continue jump to end of loop body but not end of loop

        // final keyword means field can be never change
        // final String name = "abc";
        // name = "cdf";
    }
}
