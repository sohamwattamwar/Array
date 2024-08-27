package accessModifiers1;


//class can not be declare as private or protected
public class AccessLevelTest {

    //we can declare variables as public,private,protected and default as well
    private int a=98076;
    private char c='a';
    private boolean b=10>20;

    public int p=1;
    public boolean q;

    protected long l;

    double d;

    //methods
    //we can declare methods as public,private,protected and default as well
    public void publicMethod(){
        System.out.println("public method of AccessLevelTest class");
    }
    private void privateMethod(){
        System.out.println("private method of AccessLevelTest class");
    }
    protected void protectedMethod(){
        System.out.println("protected method of AccessLevelTest class");
    }
    void defaultMethod(){
        System.out.println("default method of AccessLevelTest class");
    }

    public static void main(String[] args) {

        AccessLevelTest alt=new AccessLevelTest();
        System.out.println(alt.a);
        System.out.println(alt.c);
        System.out.println(alt.b);

        System.out.println(alt.p);
        System.out.println(alt.q);
        System.out.println(alt.l);

        alt.publicMethod();
        alt.privateMethod();
        alt.protectedMethod();
        alt.defaultMethod();




    }
}
