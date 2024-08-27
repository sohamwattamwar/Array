package abstraction;

  //if i provide the implementation to abstract method from parent class
  //in  child abstract class and then if i again extend that child class
  //in non-abstract class and again use that method or provide the implementation to
 //that method in that non abstract class and then execute it in main() then it will print the
//out put from non abstract class method
abstract class ParentClass{
    abstract void method1();
    abstract void method2();
}
abstract class Child extends ParentClass{
    void method1(){
        System.out.println("method1");
    }
  //abstract method of child class
    abstract void method3();

}
public class BasicPractise extends Child{

    @Override
    void method3() {

    }

    @Override
    void method2() {

    }


//   void method1(){
//        System.out.println("m11");
//   }
    public static void main(String[] args) {
        BasicPractise b=new BasicPractise();
        b.method1();

    }
}
