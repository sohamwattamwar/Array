package Inheritance;

public class Inheritance4 {

    void method1(){
        int [] arr={10,20,30,35,40,50,60};
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    void method2(){
        char [] chr={'s','o','h','a','m'};
        for(int j=0;j<chr.length;j++){
            System.out.print(chr[j] + ",");
        }
    }
}

class Execution extends Inheritance4{
    public static void main(String[] args){
        Execution e=new Execution();
        e.method1();
        e.method2();
    }
}