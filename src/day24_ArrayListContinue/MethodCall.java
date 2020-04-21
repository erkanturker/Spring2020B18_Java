package day24_ArrayListContinue;

public class MethodCall {
    public static void main(String[] args) {
        System.out.println(max(500,200,400));
    }

    public static int max(int a , int b){
        return (a>b)?a:b;
    }
    public static int max (int a, int b,int c){
        return max(max(a, b),c);
    }
}
