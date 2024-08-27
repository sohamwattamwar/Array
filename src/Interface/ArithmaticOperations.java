package Interface;

public interface ArithmaticOperations {

    int a=500;
    int b=250;

    void addition();
    void division();
    void substraction();
}
class Execution implements ArithmaticOperations{

    public void addition() {
        long c=a+(b*2);
        System.out.println(c);
    }
    public void division() {
      short s=a/b;
      short ss=a%b+1;
        System.out.println(s);
        System.out.println(ss);
    }

    public void substraction() {
        int d=a-b;
        int e=(2*a)-(4*b);
        System.out.println(d);
        System.out.println(e);
    }

    public static void main(String[] args) {
        Execution e=new Execution();
        e.addition();
        e.division();
        e.substraction();
    }
}