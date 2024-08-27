package variableTypes;

public class StaticVariableTest {
    String name="AA";
    static String address="udgir";
  //for static variable last given value will be applied to all objects
    public static void main(String [] args){
        StaticVariableTest obj1=new StaticVariableTest();
        obj1.name="BB";
        obj1.address="latur";

        StaticVariableTest obj2=new StaticVariableTest();
        obj2.name="CC";
        obj2.address="pune";
       // obj2.address="xyz";

        System.out.println("value of instance variable name using obj1 "+ obj1.name+'\n'+
                "value of static variable address using obj1 "+ obj1.address);

        System.out.println("value of instance variable name using obj2 "+ obj2.name+'\n'+
                "value of static variable address using obj2 "+ obj2.address);

        StaticVariableTest obj3=new StaticVariableTest();
        obj3.name="obj3value";
        obj3.address="udgircity";
        System.out.println("value of instance variable name using obj3 "+ obj3.name+'\n'+
                "value of static variable address using obj3 "+ obj3.address);



    }
}
