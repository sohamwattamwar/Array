package variableTypes;

public class StaticTest1 {
   static int value=1000;
   static int age=24;

    public static void main(String[] args) {
        //op will not change because we use printing statement before obj creation
        System.out.println(value);//1000
        System.out.println(age);//24

        StaticTest1 obj1=new StaticTest1();
        obj1.value=1111;         //below both ways are working for static variable
        age=34;
        System.out.println("using obj1 "+obj1.value);// or  value    1111
        System.out.println("using obj1 "+age);// or obj1.age          34

        StaticTest1 obj2=new StaticTest1();
        obj2.value=2222;  //or value=2222;
        obj2.age=44;  //or age =44;

        StaticTest1 obj3=new StaticTest1();
        obj3.value=3333;  //or value=3333;
        obj3.age=55;  //or age =55;

        System.out.println("using obj2 "+obj2.value);//3333  because last modified
        System.out.println("using obj2 "+obj2.age);//55
        System.out.println("using obj3 "+obj3.value);// 3333
        System.out.println("using obj3 "+obj3.age);// 55

        //for above both statement last modified value are applied
       //now here for below statement new values will be applied because
        //java execute code lin eby line
        StaticTest1 obj4=new StaticTest1();
        obj4.value=6666;  //or value=6666;
        obj4.age=5;  //
        System.out.println("using obj4 "+obj4.value);// 6666
        System.out.println("using obj4 "+obj4.age);// 5







    }







}
