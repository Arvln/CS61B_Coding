package Difining_Classes_02;

public class TestHuman {
    public static void main(String[] args) {
        // 有參構造
        Human amanda = new Human("Amanda", 7);
        amanda.introduce();
        Human.getCountOfHuman();

        Human ryo = new Human("Ryo", 6);
        amanda.copy(ryo);
        amanda.introduce();
        Human.getCountOfHuman();

        // 無參構造
        Human mario = new Human();
        mario.introduce();
        Human.getCountOfHuman();

        // this variable can't be change
    }
}
