package day_38_Exception;
/*
1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
			parameters: double seconds
			return-type: String
			Thread.sleep();

		Note: Exceptions MUST be handled within the methods
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WarmUp {
    public static void main (String[] args) {
        System.out.println ( "Erkan" );
        Wait ( 2.5 );
        System.out.println ( "Asim" );
        Properties property = new Properties ();
        String path= "/Users/turker/Desktop/Class Notes/Java/19Properties File/Data.properties";
        try {
            FileInputStream file = new FileInputStream ( path );
            property.load ( file );
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }

        String Name = property.getProperty ( "Name" );
        System.out.println ( Name );
        String ID = property.getProperty ( "ID" );
        System.out.println ( ID );
        System.out.println (getData ( "Departmant",path ));
        getData ( "LastName", "TestData.properties");


    }

    public static void Wait (double seconds) {
        try {
            Thread.sleep ( (long) (seconds * 1000) );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    }

    public static String getData (String Key, String Path) {
        String data = "";
        Properties property = new Properties ();
        try {
            FileInputStream file = new FileInputStream ( Path );
            property.load ( file );

        } catch (IOException e) {
            e.printStackTrace ();
        }
        data = property.getProperty ( Key );
        return data;
    }

}
