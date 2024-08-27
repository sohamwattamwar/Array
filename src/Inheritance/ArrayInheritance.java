package Inheritance;

public class ArrayInheritance {

    void m1(){
        int[] arr1=new int[5];
        arr1[0]=5;
        arr1[1]=15;
        arr1[2]=30;
        arr1[3]=60;
        arr1[4]=50;
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    void m2(){
        int[] arr2=new int[4];
        arr2[0]=1000;
        arr2[1]=2000;
        arr2[3]=4000;
        for(int j=arr2.length-1;j>=0;j--){
            System.out.println(arr2[j]);
        }
    }
    void m3() {
        String s[] = new String[4];
        s[0] = "1. inheritance";
        s[1] = "2. abstraction";
        s[2] = "3. polymorphism";
        s[3] = "4. encapsulation";
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    void m4(){
        String s1 []={"1.Single Level Inheritance","2.Multi Level Inheritance",
                "3.Hierarchical Inheritance","4.Multiple Inheritance"};
        for(int l=0;l<=s1.length-1;l++){
            System.out.println(s1[l]);
        }
    }
    void m5(){
        char [] ch= new char[6];
        ch[0]='B';
        ch[1]='H';
        ch[2]='A';
        ch[3]='R';
        ch[4]='A';
        ch[5]='T';
        for(int x=0;x<ch.length;x++){
            System.out.print(ch[x]);
        }
    }
}

class Execution1 extends ArrayInheritance{
    public static void main(String[] args){
        Execution1 e=new Execution1();
        e.m1();
        e.m2();
        System.out.println("Types Of Oops Concepts:-");
        e.m3();
        System.out.println("Types Of Inheritance:-");
        e.m4();
        e.m5();

    }
}