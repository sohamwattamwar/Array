package Interface;
//We use interface to achieve 100% abstraction   => this contains only abstract methods
//by default methods in interface are abstract.
public interface InterfaceIntro {
   void test();

 //in interface abstract keyword is not mandatory to declare abstract methods

   abstract void test1();
}
abstract class TestAB{

   abstract void test();
   void test1(){

   }
}
class InterfaceTest{

}