package abstraction;

//5) If concrete/non-abstract class extends  abstract class.
//then its  mandatory for that child class to provide
//method implementations of abstract methods of super class.

abstract class Abstract1{
    abstract void details();
    abstract void run();
}
public class AbstractionRule5 extends Abstract1 {
    @Override
    void details() {

    }

    @Override
    void run() {

    }
}
