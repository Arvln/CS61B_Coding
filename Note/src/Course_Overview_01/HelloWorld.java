package Course_Overview_01;

public class HelloWorld {
    // string are immutable in java
    static String helloStatement = "Hello, Java!";
    public HelloWorld(){

    }

    public static void main(String[] args) {
        String helloStatementToUpperCase = helloStatement.toUpperCase();
        String helloStatementEndWithThreeSymbols = helloStatementToUpperCase.concat("!!");
        System.out.println(helloStatementEndWithThreeSymbols);
    }
}
