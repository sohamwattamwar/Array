package abstraction;

abstract class IntroOfAbstractMethods{
    //this abstract class contains only abstract methods
    abstract void m1();

    abstract public void m2();   //abstract public / public abstract
    public abstract void m3();   // sequence can change
}

abstract class Class1{
    //this abstract class contains only non abstract method
    void dummy(){
        System.out.println("non abstract method");
    }
    void dummy1(){
    }
}
abstract class Class2{
    //this abstract class contains both abstract and non abstract method.

    abstract void run();//abstract method

    void  run1(){
       // non abstract method
    }
}
public class AbstractionBasic {
}
