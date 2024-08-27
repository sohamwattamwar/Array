package constructor1;

public class ABC {
    ABC(long s){
        System.out.println("constructor  having one argument ");
    }
    ABC(){
        System.out.println("no argument constructor");
    }
    ABC(int a,String s){
        System.out.println("constructor  having two argument ");
        System.out.println(a);
        System.out.println(s);
    }
     // int aa;
    public static void main(String[] args) {
        ABC a=new ABC(1);
        ABC a1=new ABC();
        ABC a2=new ABC(1223,"ram");
      //  System.out.println(a2.aa);

    }
}
class A{
    //this class contains default constructor
    public static void main(String[] args) {
        A a=new A();
    }
}
