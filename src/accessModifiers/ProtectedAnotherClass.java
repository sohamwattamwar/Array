package accessModifiers;

public class ProtectedAnotherClass {
    public static void main(String[] args) {
        //creating obj of source class or main class in which methods are present
        //in another class

        //same package non subclass or another class
        ProtectedAccessModifier p=new ProtectedAccessModifier();
        p.test();
        p.test2();
        p.test1();

    }
}
