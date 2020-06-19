package Replit;
/*
nstance Variables
String firstname
String lastname
int birthmonth
int birthday
int birthyear
String ssn
 */

public class Person {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public Person (String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname ( ) {
        return firstname;
    }

    public void setFirstname (String firstname) {
        this.firstname = firstname;
    }

    public String getLastname ( ) {
        return lastname;
    }

    public void setLastname (String lastname) {
        this.lastname = lastname;
    }

    /*
    Create a public getter method called getBirthday, which will return a String composed of their birthday
    in month/day/year format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

     */

    public String getBirtday(){
        String birthDay="";
        birthDay=birthmonth+"/"+birthday+"/"+birthyear;
        return birthDay;
    }

    /*
    Create a public method called verifySSN that takes in
    a String parameter and returns a boolean.  It will check
    the parameter against the person's SSN and return
    true or false based on whether they match.
     */
    public boolean verifySSN (String ssn){

        return (this.ssn==ssn);
    }

    public static void main (String[] args) {
        Person person = new Person ( "Asim","Turker",15,9,2018,"123456" );
        System.out.println (person.getBirtday ());
        System.out.println (person.verifySSN ( "12345" ));
    }

}
