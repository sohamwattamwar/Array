package Interface;

interface P{
    void run();
}
interface Q{
    abstract void run1();
}
interface R{
    void run2();
}
public class ClassImplementsInterfaces implements P,Q,R {
    @Override
    public void run() {

    }

    @Override
    public void run1() {

    }

    @Override
    public void run2() {

    }
}

interface N{

}
interface G{

}
interface H extends G ,N{

}