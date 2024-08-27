package Interface;
  //1st way of implementation
interface A{
    void test();
}
interface B extends A{
    void test1();
}
interface C extends B{
    void test2();
}
interface D extends C{
    void test3();
}

public class ClassImplementsInterface implements D{
    public void test3() {

    }

    public void test2() {

    }

    public void test1() {

    }

    public void test() {

    }
}
