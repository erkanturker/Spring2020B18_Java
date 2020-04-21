package day14_WhileLoop;
/*

        write a java program that can count how many time the word "book" is appered
        in a StringEx:input: I like books, I have books, I need bookoutput: 3

        We will use substring commamand

        Any loop can always be converted to while loop
        intilization
        while(true){
        statment;
        }

        */

public class WhileLoop {

    public static void main(String[] args) {
        String sentence = "I love book,those are really great book";
        String sentence1=sentence;
        int count =0;
        while(sentence.contains("book")){
            count++;
            sentence=sentence.replaceFirst("book","");
        }
        System.out.println(count);
        System.out.println(sentence);
        System.out.println(sentence1);

        while (true){
            System.out.println("hello world");
            break; //forcefully exiting from the loop

        }

        // we are goign to write 5 times hello world with while loop
        int i=0;
        while (true){
            // int i=0; if we declare variable it will o again and it will be infinite loop
            i++;
            System.out.println("hello world "+i);
            if (i==5){
                break;
            }
        }

        // use while loop to print all even number between 1-100
        /*
        Any loop can always be converted to while loop
        intilization
        while(condition){
        statment;
        iterator
        }
         */

        int j=1;
        while (j<=100){
            if(j%2!=0)
            {
                System.out.print(j+" ");
            }
            j++;
        }

    }
}
