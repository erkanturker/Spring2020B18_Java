package Replit;

import java.util.Scanner;

public class R140PicturePrinter {
    public static void main (String[] args) {

        System.out.println ( "select image: \n" +
                " 1)sunset \n" +
                " 2)earth \n" +
                " 3)desert" );

        Scanner scanner = new Scanner ( System.in );
        String choose = scanner.nextLine ();
        switch (choose) {
            case "sunset":
                printSunset ();
                break;
            case "earth":
                printEarth ();
                break;
            case "desert":
                printDesert ();
                break;
            default:
                System.out.println ("There is no such an element");
        }


    }


    public static void printSunset ( ) {
        System.out.print ( "_\\/_                 |                _\\/_\r\n" +
                "/o\\\\             \\       /            //o\\\r\n" +
                " |                 .---.                |\r\n" +
                "_|_______     --  /     \\  --     ______|__\r\n" +
                "1       `~^~^~^~^~^~^~^~^~^~^~^~`\r\n" );
    }//end print_sunset

    public static void printEarth ( ) {

        System.out.print ( "22        _____\r\n" +
                "    ,-:` \\;',`'-, \r\n" +
                "  .'-;_,;  ':-;_,'.\r\n" +
                " /;   '/    ,  _`.-\\\r\n" +
                "| '`. (`     /` ` \\`|\r\n" +
                "|:.  `\\`-.   \\_   / |\r\n" +
                "|     (   `,  .`\\ ;'|\r\n" +
                " \\     | .'     `-'/\r\n" +
                "  `.   ;/        .'\r\n" +
                "jgs `'-._____." );

    }//print_earth

    public static void printDesert ( ) {

        System.out.print ( " 33   .    _    +     .  ______   .          .\r\n" +
                " (      /|\\      .    |      \\      .   +\r\n" +
                "     . |||||     _    | |   | | ||         .\r\n" +
                ".      |||||    | |  _| | | | |_||    .\r\n" +
                "   /\\  ||||| .  | | |   | |      |       .\r\n" +
                "__||||_|||||____| |_|_____________\\__________\r\n" +
                ". |||| |||||  /\\   _____      _____  .   .\r\n" +
                "  |||| ||||| ||||   .   .  .         ________\r\n" +
                " . \\|`-'|||| ||||    __________       .    .\r\n" +
                "    \\__ |||| ||||      .          .     .\r\n" +
                " __    ||||`-'|||  .       .    __________\r\n" +
                ".    . |||| ___/  ___________             .\r\n" +
                "   . _ ||||| . _               .   _________\r\n" +
                "_   ___|||||__  _ \\\\--//    .          _\r\n" +
                "     _ `---'    .)=\\oo|=(.   _   .   .    .\r\n" +
                "_  ^      .  -    . \\.|" );

    }//end
}
