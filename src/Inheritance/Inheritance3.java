package Inheritance;
class ParentP{
    void land(){
        System.out.println("Father's land");
    }
    void house(){
        System.out.println("Father's house");
    }
    void savings(){
        System.out.println("Father's savings");
    }
    void gold(){
        System.out.println("Father's gold");
    }
    void car(){
        System.out.println("Father's car");
    }
}
public class Inheritance3 extends ParentP {
    void job(){
        System.out.println("Son's job");
    }
    void bike(){
        System.out.println("Son's bike");
    }

    public static void main(String[] args) {
        Inheritance3 i = new Inheritance3();
        //parent class properties
        i.land();
        i.house();
        i.savings();
        i.gold();
        i.car();
        //child class properties
        i.job();
        i.bike();
    }

}
