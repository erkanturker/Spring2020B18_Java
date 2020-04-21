package day12_StringContinue;
/*
indexOf(charValue): returns first occurred char' index number

Ex: String str ="CybertekCI";
// index number: 0123456789
int num = str.indexOf('e');
indexOf(strValue): returns the first occurence of the
given charSequence' first char' index number:
Ex: String str ="CybertekCI"
// index number: 0123456789

indexOf(strValue): returns the first occurence of the
given charSequence' first char' index number:
Ex: String str ="CybertekCI"
// index number: 0123456789
int num =  str.indexOf("ek");//6

lastIndexOf(strValue): returns the last occurence of the charSequence'
 first char' index number:Ex: String str ="CybertekCI"
 // index number: 0123456789int num= str.lastIndexOf("e");//6







 */
public class StringMethod3 {
    public static void main(String[] args) {

        String str = "Batch 12 is a great Batch";
        int num =str.indexOf("g");
        int num2 =str.indexOf("at "); //it will grab index of great not batch because ve made space
        System.out.println(num+" "+num2);


        //we will find the index nmuber of afternoon's t
        String str2 ="today is tuesday,  today we have class in the afternoon";
        System.out.println(str2.indexOf("ter"));

        //We will grap city name;

        String address = "3020 WoodSpring Dr Carmel IN 462040";
        String cityName= address.substring(address.indexOf("C"),address.indexOf("l")+1);
        System.out.println(cityName);

        //We will grap city name;

        String email="erkan.turker17@gmail.com";
        int firstIndexNumber=email.indexOf("@")+1;
        int lastIndexNumber= email.lastIndexOf("."); //it will start last string of the string object
        String emailType = email.substring(firstIndexNumber,lastIndexNumber);
        System.out.println(emailType);







    }
}
