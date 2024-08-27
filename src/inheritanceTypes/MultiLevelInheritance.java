package inheritanceTypes;

class GreatGrandFather{
    void p1(){
        System.out.println("GreatGrandFather");
    }
}
class GrandFather extends GreatGrandFather{
    void p2(){
        System.out.println("GrandFather");
    }
}
class Father extends GrandFather{
    void p3(){
        System.out.println("Father");
    }
}
class Child extends Father{
    void p4(){
        System.out.println("child");
    }
}

public class MultiLevelInheritance extends Child{
    public static void main(String[] args) {
        MultiLevelInheritance multi=new MultiLevelInheritance();
        multi.p1();
        multi.p2();
        multi.p3();
        multi.p4();

        //multi.p4();
    }
}
