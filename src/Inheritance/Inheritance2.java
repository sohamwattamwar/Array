package Inheritance;
class Parent {
    int a=200;
    int b=50;

    void method1(){
        int c=a/b;
        System.out.println("The Value Of Variable c is "+ c);
    }
    void method2(){
        int d=a*b;
        System.out.println("The Value Of Variable d is "+ d);
    }
}
public class Inheritance2 extends Parent {
    public static void main(String[] args) {
        Inheritance2 obj = new Inheritance2();
        obj.method1();
        obj.method2();
    }
}