package blocksTypes;

public class StaticBlockExample {

static int x=1111; //static variable
    static {
        System.out.println(x);//called static variable

        System.out.println("This Is Static Block ");
    }
    static void method1(){
        {
            System.out.println("instance block from static method");
        }

        System.out.println("static method");
    }
    static {
        System.out.println("First Statement in Static Block");
        {
            int x=20;
            System.out.println(x);
        }

        System.out.println("static block second");
    }
    public static void main(String[] args) {

        System.out.println("main method statement");
        method1();
    }
}
