package accessModifiers;

class DefaultAnotherClass{
    void testDefault() {
        System.out.println("testDefault method of default class");
    }
}
public class DefaultAccessModifier {
    void display(){
        System.out.println("display method of default method");
    }

    public static void main(String[] args) {
        //same class
        DefaultAccessModifier d=new DefaultAccessModifier();
        d.display();

        //same package different class i.e non subclass
        DefaultAnotherClass df=new DefaultAnotherClass();
        df.testDefault();

    }

}
