package constructor;

public class ParameterizedConstructor {
    int a;
    String s;
    boolean b;
    double d;
    ParameterizedConstructor(){
    }
    ParameterizedConstructor(int age,String name,boolean result,double percentage){
        this.a=age;
        this.s=name;
        this.b=result;
        this.d=percentage;
    }
    public static void main(String [] args){
        ParameterizedConstructor obj1=new ParameterizedConstructor();
        System.out.println("value of a is using obj1 "+obj1.a);
        System.out.println("value of s is using obj1 "+obj1.s);
        System.out.println("value of b is using obj1 "+obj1.b);
        System.out.println("value of d is using obj1 "+obj1.d);

        ParameterizedConstructor obj2=new ParameterizedConstructor(25,"soham",true,80);
        System.out.println("value of a is using obj2 "+obj2.a);
        System.out.println("value of s is using obj2 "+obj2.s);
        System.out.println("value of b is using obj2 "+obj2.b);
        System.out.println("value of d is using obj2 "+obj2.d);

        ParameterizedConstructor obj3=new ParameterizedConstructor(26,"srw",false,76);
        System.out.println("value of a is using obj3 "+obj3.a);
        System.out.println("value of s is using obj3 "+obj3.s);
        System.out.println("value of b is using obj3 "+obj3.b);
        System.out.println("value of d is using obj3 "+obj3.d);

    }
}
