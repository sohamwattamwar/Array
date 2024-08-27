package variableTypes;

public class VariableTypes {
    String instancevariable="soham";
    static String staticvariable="wattamwar";
   String instance;
    void test(){
        VariableTypes v=new VariableTypes();
        String localvariable="Localvariable";
        //called instance variable without obj
        System.out.println("instance variable"+instancevariable);
        //called instance variable using obj

        System.out.println("instance variable will get default value "+v.instance);
        //for calling local variable we dont req. obj
        System.out.println("local variable will get this value "+localvariable);
    }

    public static void main(String[] args) {
       // VariableTypes obj=new VariableTypes();
        //obj.test();
        /*System.out.println(staticvariable);*/
        VariableTypes obj1=new VariableTypes();
        obj1.instancevariable="object1";
        System.out.println("value with obj1 "+obj1.instancevariable);

    }
}
