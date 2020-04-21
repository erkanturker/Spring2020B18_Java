package day15_NestedLoop;
/*

1.  write a program which prints out the numbers from 1 to 30:
1.  for numbers which are divisible by 3, print "FIN" instead of the number.
2.  for numbers which are divisible by 5, print "RA" instead of the number
3.  for numbers which are a divisible by booth 3 and  5, print "FFINRA" instead of the numberDO NOT USE FOR LOOP

 */

public class warmup {

    public static void main(String[] args) {

        int i=1;
        String str="";
        while(i<=30){
            str = " "+i;
            if(i%3==0&&i%5==0){

                str= str.replaceFirst(""+i,"FFINRA");

            }
            else if(i%3==0){

               str= str.replaceFirst(""+i,"FIN");

            }
            else if(i%5==0){

                str= str.replaceFirst(""+i,"RA");

            }
            System.out.print(str);
            i++;

        }
        System.out.println("");
        //Muhtar's code
        int j=1;
        String str1="";

        while(j<=30){

            if(j%3==0&&j%5==0){

                str1+= "FFIRA ";

            }
            else if(j%3==0){

                str1+="FIN ";

            }
            else if(j%5==0){

                str1+="RA ";
            }
            else {
                str1+=j+" ";
            }


            j++;

        }
        System.out.println(str1);

    }

}
