package accessModifiers;

public class ProtectedAccessModifier {

    protected void test(){
        System.out.println("test method of protected method");
    }

    public void test1() {
        System.out.println("test1 method of public method");
    }
    void test2(){
        System.out.println("test2 method of default method");
    }

    public static void main(String[] args) {

        //same class for protected
        ProtectedAccessModifier x=new ProtectedAccessModifier();
        x.test();
        x.test1();
        x.test2();

    }

}
