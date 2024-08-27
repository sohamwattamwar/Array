package constructor;

import javax.imageio.stream.ImageInputStream;

public class ConstructorTypes {

    ConstructorTypes(){  //can use access modifiers also
          System.out.println("Constructor with zero argument");
    }
    ConstructorTypes(int a){
        System.out.println("Constructor with one argument");
    }
    ConstructorTypes(int a, String b,boolean c){
        System.out.println("Constructor with three argument");
    }

    public static void main(String[] args) {
        ConstructorTypes obj=new ConstructorTypes();
        ConstructorTypes obj1=new ConstructorTypes(1);
        //ConstructorTypes obj2=new ConstructorTypes(60);
        ConstructorTypes obj3=new ConstructorTypes(1,"s",true);
    }
}
class DefaultConstructorTest{
    public static void main(String [] args){
        DefaultConstructorTest d=new DefaultConstructorTest();
    }
}