package inheritanceTypes;
class GrandParent{
    void grandparent1(){
        System.out.println("Grandparent class method1");
    }
    void grandparent2(){
        System.out.println("Grandparent class method2");
    }
}
class Parent extends GrandParent{
    void parent(){
        System.out.println("Parent class method");
    }
}
class Son extends Parent{
    void son(){
        System.out.println("Son class method");
    }
}
class Grandson1 extends Son{
    public static void main(String[] args) {
        Grandson1 gs1=new Grandson1();
        gs1.son();
        gs1.parent();
        gs1.grandparent1();
        gs1.grandparent2();
    }

}
class Grandson2 extends Son{
 public static void main(String [] args){
     Grandson2 gs2=new Grandson2();
     gs2.grandparent1();
     gs2.grandparent2();
     gs2.parent();
    // gs2.son();
 }
}
public class HybridInheritance extends Son{
    public static void main(String[] args){
        HybridInheritance h=new HybridInheritance();
        h.grandparent1();
        h.grandparent2();
        h.parent();
        h.son();
    }
}
