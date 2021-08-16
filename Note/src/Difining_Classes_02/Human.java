package Difining_Classes_02;

public class Human {
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
}
