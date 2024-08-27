package variableTypes;

public class LocalAndInstance {
    int a=1000;
    int b=2000;
    int c;
    void test(){
        int d=a+b;  // called instance variable without using obj
        //local variable
        int e=1; // local variable must be initialized before its use,without initialization it cant used
        System.out.println(e);
        System.out.println(d);
        System.out.println(c);

        LocalAndInstance obj=new LocalAndInstance();
        //called same instance variable using obj
        int f=obj.a+obj.b; //called same instance variable using obj
        System.out.println(f);
        System.out.println(obj.c);
    }
    void test1(){
        //local variable can not be accessed outside that method in which it is declared
    }


    public static void main(String[] args) {
        //Using objects we can provide different values to single instance variable

        LocalAndInstance obj=new LocalAndInstance();
        //obj.test();
        System.out.println("Value Of a Using obj "+obj.a);
        System.out.println("Value Of a Using obj "+obj.b);

        LocalAndInstance obj1=new LocalAndInstance();
        obj1.a=1100;
        obj1.b=2100;
        System.out.println("Value Of a Using obj1 "+obj.a);
        System.out.println("Value Of a Using obj1 "+obj.b);
    }
}
