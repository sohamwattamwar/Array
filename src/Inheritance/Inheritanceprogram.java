package Inheritance;

public class Inheritanceprogram {

    int a=500;
    int b=400;
    int c=450;

    void practiceMethod1(){
        if(a>b && a>c){
            System.out.println("A has the biggest value");
        } else if (b>a && b>c) {
            System.out.println("B has the biggest value");
        }
        else if(c>a && c>b){
            System.out.println("C has the biggest value");
        }
        else{
            System.out.println("A/B/C may have same value");
        }
    }
    void practiceMethod2(){
        if(a>b){
            System.out.println("A is greater");
        }

    }
    void practiceMethod3(){
        int e= a+b+c;
        System.out.println("value of e is "+ e);
    }

}


class Childclass extends Inheritanceprogram{
    public static void main(String[] args) {
        Childclass ch =new Childclass();
        ch.practiceMethod1();
        ch.practiceMethod2();
        ch.practiceMethod3();

    }
}