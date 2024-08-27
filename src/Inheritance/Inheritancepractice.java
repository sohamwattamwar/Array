package Inheritance;

public class Inheritancepractice {

    int age = 30;

    void evenOdd() {
        int number = 11;

        if (number % 2 == 0) {
            System.out.println("The Given Number " + number + " Is Even Number");
        } else {
            System.out.println("The Given Number " + number + " Is Odd Number");
        }
    }

    void method() {
        if (age > 18) {
            System.out.println("You Are Eligible For Voting");
        }
    }
}

class Execute extends Inheritancepractice{
    public static void main(String[] args) {
        Execute e=new Execute();
        System.out.println(e.age);
        e.evenOdd();
        e.method();
    }
}


