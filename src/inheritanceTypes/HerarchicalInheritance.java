package inheritanceTypes;

class HerarchicalParent{
    void hp1(){
        System.out.println("HerarchicalParent method1 ");
    }
    void hp2(){
        System.out.println("HerarchicalParent method2");
    }
    void hp3(){
        System.out.println("HerarchicalParent method3");
    }
}
class HerarchicalChild1 extends HerarchicalParent{
    public static void main(String[] args) {
        HerarchicalChild1 child1=new HerarchicalChild1();
        child1.hp1();
        child1.hp2();
        child1.hp3();
    }
}

public class HerarchicalInheritance extends HerarchicalParent {
    public static void main(String[] args) {
        HerarchicalInheritance h = new HerarchicalInheritance();
        h.hp1();
        h.hp2();
    }
}