package day12_StringContinue;
/*
isEmty
this check the String is empty or not
return boolean Expression
equals(str)
Checks if the two String ' face values are equal or not

equals(str):
checks if the two String' visible text are
equal or not, then returns boolean expression
equal ==> true       !equal ==> false
Ex: String A1 = "Cybertek";String A2 = new String("Cybertek");
A1 == A2 ==> // false,  different location
A1.equals(A2)==> //true, visible text is same

equalsIgnoreCase(str)
 equalsIgnoreCase(str):checks if the two String' visible text are equal or not,
 then returns boolean expression
 IGNORES THE CASE SENSITIVITY

 */
public class StringMethodBoolean {
    public static void main(String[] args) {

        String str="";
        boolean r1=str.isEmpty();

        if (r1){
            System.out.println("The string is empty");
        }
        else{
            System.out.println("The String is given is not empty");
        }

        String str2 = "Erkan";
        boolean r2 =str2.isEmpty();
        System.out.println(r2);
        String str3 = new String("Erkan");
        System.out.println(str2.equals(str3));
        System.out.println("java".equals("Java")); //it is not equal because of case case sensivity
        System.out.println("java".equalsIgnoreCase("JAva")); //this is true

    }

}
