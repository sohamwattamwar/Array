package constructor;

public class ThisKeywordTest {
    ThisKeywordTest(){
        this(987,"hello",'a');
        System.out.println("No-Arg Constructor");
    }
    ThisKeywordTest(int a){
        this();
        System.out.println("Integer Arg Constructor");
    }
    ThisKeywordTest(String s){
        this(1997);
        System.out.println("String Arg Constructor");
    }
    ThisKeywordTest(boolean b){
        this("java",1995);
        System.out.println("Boolean Arg Constructor");
    }
    ThisKeywordTest(String m,int d){
        this(1995,"java");
        System.out.println("String And Integer Arg Constructor");
    }
    ThisKeywordTest(int d,String m){
        this("hello");
        System.out.println("Integer And String Arg Constructor");
    }
    ThisKeywordTest(int s,String d,char c){
        System.out.println("Three Arg Constructor");
    }

    public static void main(String[] args) {
        ThisKeywordTest t=new ThisKeywordTest(true);
        //16,20,24,12,8,4,28
    }

}
