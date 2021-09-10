package Lab.Lab5;

public class TestPart2 {
    public static void main(String[] args) {
        // Java accept super class and interface method have the same name
        // but, if the return type is different ,you can't do it
        // if the parameters name is different, you still can do it
        // if the parameters count is not the same, still works
        X x = new X();
        x.hello();
        x.helloEveryone("A", "B");
        Y y = new Y();
        y.hello("I'm Arvin!");
        y.helloEveryone("A", "B", "C");
    }
}
