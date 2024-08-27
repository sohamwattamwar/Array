package constructor;

public class ConstructorIntro {

    ConstructorIntro(){
     System.out.println("This is the constructor of class");
    }
    void ConstructorIntro(){
        System.out.println("This is method of class");
    }
    int addition(int a,int b){
        System.out.println("Addition method");
        return a+b;
    }
    public static void main(String[] args) {
        ConstructorIntro ci=new ConstructorIntro();
        ci.ConstructorIntro();
        ci.addition(1,2);
    }

}
