package abstraction;
abstract class AbstractClass1{

    abstract void test(); //abstract method
    abstract void test1();

    void run(){ //non-abstract method
        System.out.println("non abstract method run");
    }

}
public class AbstractionIntro1 extends AbstractClass1  {

    @Override
    void test() {
        System.out.println("test method ");
    }

    @Override
    void test1() {
        System.out.println("test1 method ");
    }

    public static void main(String[] args) {
        AbstractionIntro1 a=new AbstractionIntro1();
        a.test();
        a.test1();
        a.run();
    }
}
