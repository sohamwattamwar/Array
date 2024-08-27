package blocksTypes;

public class StaticInstanceexample {
    static int a=1234;
    int b=5678;

    static {
        System.out.println(a);
       // System.out.println(b);//instance can not be accessed in static block
    }
    {

        System.out.println(a);
        System.out.println(b);
    }

     void m1(){

    }
}

