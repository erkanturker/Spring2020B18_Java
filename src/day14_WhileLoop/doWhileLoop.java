package day14_WhileLoop;
/*
    do{
    statement;
    }while(condition);

    Compiler executes the do block first and the check the condition
    is true keep executes,other wise exits the loop
    do-while loops gets executed at least once regardless of the condition


 */

public class doWhileLoop {
    public static void main(String[] args) {
        int i= 0;
        do{
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;

        }while(i<=100);
    }
}
