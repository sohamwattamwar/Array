package Inheritance;

public class inheritance {

    int a = 10;
    int b= 20;
    public void ParentMethod1()
    {
        System.out.println(" print parent method1");
        int c = a+b;
        System.out.println(c);
    }

    public void ParentMethod2()
    {
        System.out.println(" print parent method2");

    }

}

class ChildClass extends inheritance
{
    public static void main(String[] args)
    {
        ChildClass ch1 = new ChildClass();
        ch1.ParentMethod1();
        ch1.ParentMethod2();

    }
}
