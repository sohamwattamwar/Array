package accessModifiers1;

import accessModifiers.ProtectedAccessModifier;

public class ProtectedModifierTest extends ProtectedAccessModifier {
    public static void main(String [] args){
        //if i have to access the protected method from another package

        // i have to create the obj of child class only
        //i have performed the inheritance operation i.e child and parent class

        //and if i have created the obj of parent class
        // i will be not able to access that protected method.
        // because i have created object of parent class not child class with this only got
        //access of public method


        //here i have tried to access protected method from another package
        //by creating obj of parent class
        // it does not got accessed
        //only public method iam able to access
        ProtectedAccessModifier pam=new ProtectedAccessModifier();
        pam.test1();

        //protected method only get accessed by creating obj of child class.
        ProtectedModifierTest pmt=new ProtectedModifierTest();
        pmt.test();
        pmt.test1();//only got public and protected method in another package child class
                    //not default out side package
    }
}
