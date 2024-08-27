package Inheritance;

public class ForLoopPrgm {

    void loop1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
    void loop2(){
        for(int i=5;i>0;i--){
            System.out.println(i);
        }
    }
    void loop3(){
        for(int j=0;j<5;j++){
            System.out.print(j +",  ");
        }
    }
}
class ForLoopExecution extends ForLoopPrgm{
    public static void main(String[] args) {
        ForLoopExecution exe =new ForLoopExecution();
        exe.loop1();
        exe.loop2();
        exe.loop3();

    }
}