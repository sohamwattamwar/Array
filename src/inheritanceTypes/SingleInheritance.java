package inheritanceTypes;

class SingleInheritanceParent {
    boolean b = 45 > 46;

    void parent1() {
        System.out.println("parent1 method exicuted");
    }
}
public class SingleInheritance extends SingleInheritanceParent {
    public static void main(String[]args){
        SingleInheritanceParent s=new SingleInheritanceParent();
        System.out.println(s.b);//obj.variable name
        s.parent1();
    }
}
