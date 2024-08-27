package variableTypes;

public class InstanceVariable {
    String instancevariable="instance variable";
    String name;

    //we can also provide values to instance variable using constructor & this keyword
    InstanceVariable(){

    }
    InstanceVariable(String name1){
        this.name=name1;
    }


    public static void main(String[] args) {
        InstanceVariable obj1=new InstanceVariable();
       obj1.name="soham";
       //obj1.instancevariable="default";
       System.out.println("value of instance variable name using obj1 is "+ obj1.name);
     //System.out.println("value of instance variable name using obj1 is "+ obj1.instancevariable);

        InstanceVariable obj2=new InstanceVariable();
        obj2.name="wattamwar";
        System.out.println("value of instance variable name using obj2 is "+ obj2.name);

        InstanceVariable obj3=new InstanceVariable();
        obj3.name="practice";
        System.out.println("value of instance variable name using obj3 is "+ obj3.name);

      //using constructor
        InstanceVariable obj4=new InstanceVariable("using constructor");
        System.out.println("value of instance variable name using obj4 is "+ obj4.name);
    }
}
