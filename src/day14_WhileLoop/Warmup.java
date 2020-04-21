package day14_WhileLoop;
/*

write a java program that can count how many time the word "book" is appered
in a StringEx:input: I like books, I have books, I need bookoutput: 3

We will use substring commamand




 */
public class Warmup {
    public static void main(String[] args) {

        String sentence ="I like reading books, I have books,I need a book book book";
        int count=0;

        for (int i = 0; i < sentence.length()-3; i++) { // -3 minus because we will add
                                                        // 4 substring if we did not add string will be out of index and give the error



            if (sentence.substring(i,i+4).equals("book")){
                count++;
                // the code will work like that for i= 0
                //sub string 0,4 it means i li it does not equal book
                //i=1 substring 1,4 " lik" it does
                //..
                //i=15 substrubg 15 , 19 "book" that is equal to book ant count inctremnt



            }

        }
        System.out.println(count);

    }
}
