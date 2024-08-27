package constructor;

public class BasicPractise {
    //the standard syntax to declare a constructor is

    // public Constructorname with signature bracket OR public Classname()

    //because constructor has same name as class name

    BasicPractise(){
        System.out.println("Zero Argument Or NoArgument Constructor");
    }

    //non static method

    void testmethod1(){
        System.out.println("Testmethod1 of class Basicpractise");
    }

    //method syntax
    //returntype methodname();

    int addition(int a,int b){
        int c=a+b;
        System.out.println("Addition or two numbers is = "+c);
    return c;
    }
     String name(int a,int b){
        System.out.println("hi");
        return "soham";
     }
    public static void main(String[] args) {
        BasicPractise b= new BasicPractise();
        b.addition(2000,3000);
        b.addition(9,9);
        b.name(99,9);
    }








}
