package constructor1;

public class ConstructorIntro {
    //when we dont provide a constructor in class then jvm will provide a default constructor.
    //default constructor is used to provide default values to variables .
    //no argument constructor is same as default constructor (method signature is same for both).
   int a; char c;float f;

    /*ConstructorIntro(){
        //if dont use this jvm will provide default constructor
        System.out.println("Zero argument Constructor");
    }*/

    public static void main(String [] args){
        ConstructorIntro c=new ConstructorIntro();
        System.out.println(c.a);
        System.out.println(c.c);
        System.out.println(c.f);
    }
}
