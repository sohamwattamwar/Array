package constructor;

class BB extends AA{
    BB(){
        System.out.println("BB class no argument constructor");
    }
}
class AA {
    AA(String s){
        System.out.println("AA class  argument constructor");
    }
    AA() {
        System.out.println("AA class no argument constructor");
    }
}
public class ConstructorChainingTest extends BB{
    ConstructorChainingTest(int a){
        System.out.println("ConstructorChainingTest class  argument constructor");
    }

    public static void main(String[] args) {
        ConstructorChainingTest cc=new ConstructorChainingTest(987);
    }
}
