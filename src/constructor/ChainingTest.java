package constructor;
class A{
   A(){
       System.out.println("No Arg Constructor Of Class A");
   }
}
class B extends A{
    B(){
        System.out.println("No Arg Constructor Of Class B");
    }
    B(int a){
        System.out.println("Argument Constructor Of Class B");
    }
}
public class ChainingTest extends B{
    ChainingTest(){
        System.out.println("No Arg Constructor Of Class ChainingTest");
    }

    public static void main(String[] args) {
        ChainingTest ct= new ChainingTest();
    }
}
