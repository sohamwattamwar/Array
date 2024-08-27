package Interface;

interface FirstInterface{
    void testMethod1();
    void testMethod2();
    void testMethod3();
}
interface SecondInterface{
    void testMethod4();
    void testMethod5();
    void testMethod6();

}
abstract class FirstAbstractClass implements FirstInterface,SecondInterface{
   public void testMethod1(){
        //here before providing implementation to abstract methods from interface
       //in abstract class we have to use public modifier
       //because methods in interface are by default public and abstract
       System.out.println("testMethod1 from FirstInterface");
    }
    public void testMethod4(){
        System.out.println("testMethod4 from SecondInterface");
   }

}
public class ClassImplements2interface extends FirstAbstractClass {
    @Override
    public void testMethod2() {
        System.out.println("testMethod2 from FirstInterface");
    }
    @Override
    public void testMethod3() {
        System.out.println("testMethod3 from FirstInterface");
    }
    @Override
    public void testMethod5() {
        System.out.println("testMethod5 from SecondInterface");
    }
    @Override
    public void testMethod6() {
        System.out.println("testMethod6 from SecondInterface");
    }
    public static void main(String[] args){
        ClassImplements2interface c=new ClassImplements2interface();
        c.testMethod1();
        c.testMethod2();
        c.testMethod3();
        c.testMethod4();
        c.testMethod5();
        c.testMethod6();

    }
}
