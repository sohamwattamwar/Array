package constructor;

public class ConstructorClass
{
/*ConstructorClass(){
    //this is like default constructor
}*/

    ConstructorClass(){
        System.out.println("This Is Constructor");
    }

    void ConstructorClass(){
        //this method has same name as of classname i.e C is in uppercase
        System.out.println("method ConstructorClass");

    }
    void constructorClass(){
        //this method has same name as of classname  but c starts with lowercase
        System.out.println("method constructorClass");
    }

    public static void main(String[] args) {
        ConstructorClass c= new ConstructorClass();
        c.ConstructorClass();
        c.constructorClass();
      //syntax for calling constructor
        new ConstructorClass();// calling constructor
    }

}
