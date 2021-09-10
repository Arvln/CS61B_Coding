package Lab.Lab5;

public class Y extends X implements helloable {
    Object y;
    public static final int old = 5;

    public void hello(String s){
        System.out.println("Hello Sub!" + s);
    }

    public void helloEveryone(String firstPerson, String secondPerson, String thirdPerson){
        System.out.println("Hello, " + firstPerson + " and " + secondPerson + " and " + thirdPerson + ".");
    }

    public void testMethodCall(){
        System.out.println("Call Sub!");
    }

    public void callSuperMethod(){
        super.testMethodCall();
    }
}
