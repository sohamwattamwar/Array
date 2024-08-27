package constructor1;

public class ThiskeywordTest1 {
    ThiskeywordTest1(){
        this(100);
       System.out.println("Non parametrized constructor");
    }
    ThiskeywordTest1(int a){
       // this();
        System.out.println(" parametrized constructor");
    }

    public static void main(String[] args) {
        ThiskeywordTest1 t=new ThiskeywordTest1();
    }
}
