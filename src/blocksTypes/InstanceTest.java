package blocksTypes;

public class InstanceTest {
    static {

        {

            System.out.println("instance block in static block");
        }
    }
    static void m1(){
        {
            System.out.println("instance block in static method");
        }
    }
    void m2(){
        {
            System.out.println("instance block in non-static method");
        }
    }
    {
        System.out.println("first statement in outer instance block");
        {
            System.out.println("first statement in inner instance block");

            {
                System.out.println("instance block in instance static block");
            }
            System.out.println("second statement in inner instance block");
        }
        System.out.println("second statement in outer instance block");
    }

    public static void main(String[] args) {
        {
            System.out.println("instance block from main()");
        }
        m1();

        InstanceTest obj = new InstanceTest();
        obj.m2();

        {
            System.out.println("second instance block from main()");
        }
    }
}
