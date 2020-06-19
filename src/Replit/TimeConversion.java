package Replit;

public class TimeConversion {
    public static void main (String[] args) {
        timeConversion ( "12:12:12PM" );
    }

    public static void timeConversion (String s) {
        /*
         * Write your code here.
         */
        String[] strings = s.split ( ":" );

        String shour="";
        int ihour;
        if(strings[0].length ()>1){
            shour = s.substring ( 0, 2 );
            ihour = Integer.parseInt ( shour );

        }else{
            shour = s.substring ( 0, 1 );
            ihour = Integer.parseInt ( shour );
        }


        if (s.contains ( "AM" ) && shour.equals ( "12" )) {
            s = s.replaceFirst ( shour, "00" );
            s = s.replace ( "AM", "" );
        } else if (s.contains ( "PM" ) && shour.equals ( "12" )) {
            s = s.replace ( "PM", "" );
        } else if (s.contains ( "PM" )) {
            ihour += 12;
            s = s.replaceFirst ( shour, "" + ihour );
            s = s.replace ( "PM", "" );
        } else if (s.contains ( "AM" )) {
            s = s.replace ( "AM", "" );
        }


        System.out.println ( s );

    }

}
