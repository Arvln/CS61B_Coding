package Lab.Lab5;

public class TestPart4 {
    public static void main(String[] args) {
        Y y = new Y();
        ((X)y).testMethodCall();
        X x = new X();
        ((Y)x).testMethodCall();
        y.callSuperMethod();
    }
}
