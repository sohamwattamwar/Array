package Interface;

interface Details{
    void name();
    void address();
    void age();
}

abstract class DetailsClass implements Details{

//    4) If one abstract class implements interface,
//    then it's not mandatory for that child class to provide method implementations
//    of abstract methods of interface.

}
public class AbstractClassImplementsInterface implements Details {

//        5) If concrete/non-abstract implements interface,
//        then its  mandatory for that child class to
//        provide method implementations of abstract methods of interface.


    @Override
    public void name() {

    }

    @Override
    public void address() {

    }

    @Override
    public void age() {

    }
}
