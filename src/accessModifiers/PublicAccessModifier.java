package accessModifiers;

public class PublicAccessModifier {

    public void run(){
        System.out.println("public method run");
    }

    public static void main(String [] args){
        PublicAccessModifier pam=new PublicAccessModifier();
        pam.run();


    }
}
