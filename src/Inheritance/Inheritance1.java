package Inheritance;

public class Inheritance1{
    int a=200;
    byte b=101;
    boolean result=a>b;

    void comparison(){
        if(a>0 && b<500){
            System.out.println("condition passed");
        }else{
            System.out.println("condition failed");
        }

        if(result==true){
            System.out.println("a is greater than b");
        }
    }
}

class Child1 extends Inheritance1{

    public static void main(String [] args){
        Child1 ch=new Child1();

        System.out.println(ch.a);
        System.out.println(ch.b);
        System.out.println(ch.result);

        ch.comparison();
    }
}