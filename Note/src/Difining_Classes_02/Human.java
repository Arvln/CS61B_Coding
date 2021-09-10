package Difining_Classes_02;

public class Human {

    // static field will be share by Human class between different objects => class variables
    public static int countOfHuman;
    public String name;
    public int age;

    public Human() {
        countOfHuman++;
        name = "Mario";
        age = 12;
    }
    public Human(String name, int age){
        countOfHuman++;
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("I'm " + name + " and I'm " + age + " years old.");
    }
    public void copy(Human human){
        name = human.name;
        age = human.age;
    }

    // static method have no variable name "this"
    public static void getCountOfHuman(){
        System.out.println("Total Human counts: " + countOfHuman);
    }
}
