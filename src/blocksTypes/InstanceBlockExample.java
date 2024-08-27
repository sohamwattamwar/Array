package blocksTypes;

public class InstanceBlockExample {
    int s=100; //instance variable decalred
    {
        System.out.println("first instance block");
        System.out.println(s); //called the instance variable in instance block
    }

    {
        int x = 789;
        System.out.println("second  instance block");
        String a = "Instance block string value";
        System.out.println(a);
        System.out.println(x);
    }
    int y=0;
static {

}

    public static void main(String[] args) {
        InstanceBlockExample i=new InstanceBlockExample();

    }
}