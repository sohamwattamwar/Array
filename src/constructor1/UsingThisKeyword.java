package constructor1;

public class UsingThisKeyword
{
    int age;
    String name;
    String city;
UsingThisKeyword(){

}
    UsingThisKeyword(int age,String name,String city){
        this.age=age;
        this.name=name;
        this.city=city;
    }
    public static void main(String [] args){
        UsingThisKeyword u=new UsingThisKeyword();
        //here in this we have not provided ant values to variables
        //so constructor will provide default values.
        System.out.println("value of age is using object u "+u.age);
        System.out.println("value of name is using object u "+u.name);
        System.out.println("value of city is using object u "+u.city);

        UsingThisKeyword t=new UsingThisKeyword(40,"ramesh","pune");
        System.out.println("value of age is using object t "+t.age);
        System.out.println("value of name is using object t "+t.name);
        System.out.println("value of city is using object t "+t.city);

        UsingThisKeyword k=new UsingThisKeyword(30,"suresh","pune");
        System.out.println("value of age is using object k "+k.age);
        System.out.println("value of name is using object k "+k.name);
        System.out.println("value of city is using object k "+k.city);
    }
}
