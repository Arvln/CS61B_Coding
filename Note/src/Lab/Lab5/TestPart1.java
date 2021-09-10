package Lab.Lab5;

public class TestPart1 {
    public static void main(String[] args) {
        X[] xa = {new X(), new X()};
        Y[] ya = {new Y(), new Y()};
        xa = ya;  // compile OK, run-time OK
        ya = (Y[])xa;  // need cast, compile OK, run-time OK
        xa = ya;
    }
}
