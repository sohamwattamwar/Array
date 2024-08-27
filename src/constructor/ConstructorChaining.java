package constructor;
class ConstructorParent{
ConstructorParent() {
    System.out.println("No Arg Constructor Of ConstructorParent");
}
}
public class ConstructorChaining extends ConstructorParent {
    ConstructorChaining(){
        System.out.println("No Arg Constructor Of ConstructorChaining");
    }
    ConstructorChaining(String s){
        //super()   ==This line will be added by jvm
        //in any constructor first line will be call to parent class default constructor
        System.out.println(" Arg Constructor Of ConstructorChaining");
    }
    public static void main(String[] args){
        //will print parent class constructor and constructorchaing with No-Arg
        ConstructorChaining c=new ConstructorChaining();
        //will print parent class constructor and constructorchaing with arg
        ConstructorChaining cc=new ConstructorChaining("java");
    }
}
