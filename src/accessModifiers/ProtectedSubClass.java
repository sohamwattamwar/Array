package accessModifiers;

public class ProtectedSubClass extends ProtectedAccessModifier{
    public static void main(String[] args) {

        //same package sub class


        //public protected default accessed in another class same package
        //1.with parent class object And with child class object

        ProtectedAccessModifier pam=new ProtectedAccessModifier();//obj of parent
        pam.test();
        pam.test1();
        pam.test2();

        ProtectedSubClass pt=new ProtectedSubClass();//obj of subclass
        pt.test();


    }
}
