package accessModifiers;

//same package subclass
 class DefaultAccessModifier2  extends DefaultAnotherClass{
    public static void main(String[] args) {

        //calling method using child class
        DefaultAccessModifier2 dam=new DefaultAccessModifier2();
        dam.testDefault();

       //calling default method in child class but by creating obj of parent class
        DefaultAnotherClass df=new DefaultAnotherClass();
        df.testDefault();



    }
}
