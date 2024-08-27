package constructor;
class Super{ //Super is class name
    Super(){//constructor name
        System.out.println("Class Super NoArgument Constructor");
    }
    Super(String name){
        System.out.println("Class Super Argument Constructor");
    }
}
public class SuperKeywordTest extends Super {

    SuperKeywordTest(){
        //super();//here super is keyword
       // super("java"); //if we dont use super keyword it will by default make call to
                         //no argument constructor and if we provide specific argument
                         // in super keyword it will call that constructor
        System.out.println("SuperKeywordTest Class Constructor");
    }
    public static void main(String [] args){

        SuperKeywordTest st=new SuperKeywordTest();
    }
}
