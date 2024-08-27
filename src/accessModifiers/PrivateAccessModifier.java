package accessModifiers;

public class PrivateAccessModifier {
    private int v=1111;
    protected int q=1234;

    private void methodPrivate(){
        int a=50;
        System.out.println(a);
        System.out.println("private method");

        //calling variable in non static method without obj
        //but for main() we have to use obj
        System.out.println(v);

    }

    public static void main(String[] args) {
        PrivateAccessModifier p =new PrivateAccessModifier();
        //variable calling
        System.out.println(p.v);//obj.variable name
        System.out.println(p.q);//obj.variablename

        p.methodPrivate();


    }

}
