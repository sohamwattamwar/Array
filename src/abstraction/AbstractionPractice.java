package abstraction;

abstract class Practice{
    void information(){
        System.out.println(" ====Student Details==== ");
    }
    abstract void studentName();
    abstract void city();
    abstract void course();
}

class Student1 extends Practice{

    @Override
    void studentName() {
     System.out.println("Students Name is :- Soham Wattamwar");
    }

    @Override
    void city() {
        System.out.println("Students is from  :- Udgir ");
    }

    @Override
    void course() {
        System.out.println("course :- Java Development");
    }
}
class Student2 extends Practice{

    @Override
    void studentName() {
        System.out.println("Students Name is :- Soham");
    }

    @Override
    void city() {
        System.out.println("Students is from  :- Latur ");
    }

    @Override
    void course() {
        System.out.println(" course :- Software Testing");
    }
}
public class AbstractionPractice {
    public static void main(String [] args){
        Student1 s1=new Student1(); //Student1 class obj
        s1.information();
        s1.studentName();
        s1.course();
        s1.city();

        Student2 s2=new Student2();
        s2.information();
        s2.studentName();
        s2.course();
        s2.city();
    }
}
