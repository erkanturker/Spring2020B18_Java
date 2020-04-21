package day21_Recap;
/*
Write a method that can calculate grade

 */

public class WarmUp3 {
    public static void main(String[] args) {
        CalculateGrades(89);
    }

    public  static void CalculateGrades(int score){
        char grade = (score>=90 && score<=100)?'A':
                (score>=80 && score<=89)?'A':(score>=70 && score<=79)?'A':
                        (score>=60 && score<=69)?'A':(score>=0 && score<=59)?'A':'I';
        if(grade=='I'){
            System.out.println("invalid entery");

        }
        else System.out.println(grade);
    }


}
