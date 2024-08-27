package abstraction;

//4) If one abstract class extends another abstract class.
//then it's not mandatory for that child class to provide
//method implementations of abstract methods of super class.

abstract class AbstractClass11{

    abstract void test1();
    abstract void test2();
}
abstract class AbstractClass12 extends AbstractClass11{
    void test1(){

    }

}

public class AbstractionRule4  {
}
