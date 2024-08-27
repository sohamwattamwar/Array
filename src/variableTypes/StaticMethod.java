package variableTypes;

public class StaticMethod {
    //static method

    static void staticMethod(){
        System.out.println("we dont need to create instance of a class or object, "+
                "to call static method");
    }
    //non static method

    void instanceMethod(){

        System.out.println("we  need to create instance of a class or object, "+
                "to call non-static method or instance method");
    }

    public static void main(String[] args) {
        //to call static method we use below syntax
        //classname.methodname();  or methodname();

        StaticMethod.staticMethod(); // or staticMethod();

        //for non static method we need to create object
        StaticMethod obj=new StaticMethod();
        obj.instanceMethod();
    }
}
class StaticTest{
    static void testMethod(){

        StaticTest obj=new StaticTest();//creating obj
        obj.testMethod1();//calling non static method of class in static method by using object
        System.out.println("TestMethod is static method");
    }
    void testMethod1(){
        //called static method of a class in nonstatic or instance method,without creating obj
       // testMethod();

        System.out.println("TestMethod1 is non-static method");
    }
}
class ExecutionStaticTest{
    public static void main(String[] args) {
        //calling static method from different class
        //classname.methodname();
        StaticTest.testMethod();

        //calling nonstatic or instance method from another class
        //we need to create the obj of specific class
        StaticTest s=new StaticTest();
        s.testMethod1();
        //OR
        new StaticTest().testMethod1();
    }
}