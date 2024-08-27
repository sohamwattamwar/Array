package abstraction;

//method declaration
//method implementation
abstract class Abstraction{

    abstract void eat();  //method declaration hiding implementation
}

class IndianWayOfEating extends Abstraction{

    @Override
    void eat() {     //method implementation

        System.out.println("Indian People Eats Using There Hands");
    }
}
class WesternWayOfEating extends Abstraction{

    @Override
    void eat() {
        System.out.println("Western People  Eats Using Spoon And Forks");
    }
}
public class HowToUseAbstraction {
    public static void main(String[] args) {
        IndianWayOfEating i=new IndianWayOfEating();
        i.eat();
        WesternWayOfEating w=new WesternWayOfEating();
        w.eat();
    }
}
