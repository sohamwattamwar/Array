package superAndThisKEYWORD;

class parent1
{
    parent1()
    {   this(10);
        System.out.println("Parent1 no argument constructor");
    }

    parent1(int a)
    {   this(10,20);
        System.out.println("Parent1 1 argument constructor");
    }

    parent1(int a, int b)
    {   this(10,20,30);
        System.out.println("Parent1 2 argument constructor");
    }

    parent1(int a, int b, int c)
    {
        System.out.println("Parent1 3 argument constructor");
    }


}

class parent2 extends parent1
{
    parent2()
    {  this(10);
        System.out.println("parent2 no argument constructor");
    }

    parent2(int a)
    {   this(10,20);
        System.out.println("parent2 1 argument constructor");
    }

    parent2(int a, int b)
    {   this(10,20,30);
        System.out.println("parent2 2 argument constructor");
    }

    parent2(int a, int b, int c)
    {   super();
        System.out.println("parent2 3 argument constructor");
    }

}

class parent3 extends parent2
{
    parent3()
    {   this(10);
        System.out.println("parent3 no argument constructor");
    }

    parent3(int a)
    {   this(10,20);
        System.out.println("parent3 1 argument constructor");
    }

    parent3(int a, int b)
    {    this(10,20,30);
        System.out.println("parent3 2 argument constructor");
    }

    parent3(int a, int b, int c)
    {   super();
        System.out.println("parent3 3 argument constructor");
    }

}

public class SuperAndThisKeyWord1 extends parent3
{

    public static void main(String[] args)
    {
        SuperAndThisKeyWord1 obb = new SuperAndThisKeyWord1();

    }

}
