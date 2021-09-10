package Steak_And_Heap;

public class ParametersPassing {
    // Java memory is store at steak and heap
    // Parameters passing
    // Java is passing all parameter by value
    public static void main(String[] args) {
        // parameter is not reference to an object
        int testNumber = 1;
        doNothingToa(testNumber);
        System.out.println(testNumber);  // 1

        // parameter is a reference to an object
        // local parameter only copy reference point to the same object
        IntBox intbox = new IntBox();
        intbox.setNumberTo3(intbox);
        System.out.println(intbox.number);  // 3
    }

    public static void  doNothingToa(int numberPassIntoFunction){
        numberPassIntoFunction = 2;
    }
}
