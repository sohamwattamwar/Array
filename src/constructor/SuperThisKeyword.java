package constructor;
class SuperClass{
    SuperClass(){
        this(1);
        System.out.println("parent class default constructor");
    }
    SuperClass(int a){
        System.out.println("parent class integer argument constructor");
    }
}
public class SuperThisKeyword extends SuperClass {
    SuperThisKeyword(){
        //by default jvm will provide super() or call parent class default const
        //or we can use
        super();// dont required by default jvm will provide
        System.out.println("zero argument constructor");
    }
    SuperThisKeyword(String a){
        this(4);
        System.out.println("String argument constructor");
    }
    SuperThisKeyword(int b){
        this();
        System.out.println("Integer argument constructor");
    }
    SuperThisKeyword(String d,String f){
        this("keyword");
        System.out.println("Two String argument constructor");
    }

    public static void main(String [] args){
        SuperThisKeyword s=new SuperThisKeyword("Super","This");
    }
}

