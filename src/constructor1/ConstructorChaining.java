package constructor1;
class ParentConstructor{
    ParentConstructor(){
        System.out.println("zero argument constructor of parentconstructor");
    }
}
public class ConstructorChaining extends ParentConstructor {
    //in constructor chaining first line of any constructor will be
    //call to parent class default constructor
    //both argument and no argument constructor
    ConstructorChaining(){
        System.out.println("zero argument constructor of ConstructorChaining");
    }

    public static void main(String[] args) {
        ConstructorChaining c=new ConstructorChaining();
        //it will print o/p from both class constructors


    }
}
