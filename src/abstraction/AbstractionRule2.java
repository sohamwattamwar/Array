package abstraction;

   //2) If we define any abstract method in a class, then that class must be abstract class.
   // 3) We can not create an object of abstract class.
 abstract class Rule2Class{

     //we can declare abstract methods in abstract class only.
     //we can not declare abstract methods in non-abstract class

       abstract void test(); //abstract method

     public static void main(String [] args){
        //Rule=> 3) We can not create an object of abstract class.

        // Rule2Class r=new Rule2Class();

         //here i have tried to create the object of abstract class
         //but has given the error .
     }
 }
public class AbstractionRule2 {
    public static void main(String[] args) {
      //  Rule2Class rc=new Rule2Class();
      //in another class it not allowed to create the obj of abstract class
    }
}
