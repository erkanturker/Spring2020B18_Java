package day_38_Exception;

//We will create a method that it has file and propertie class and will load properies file
//It return data on our file according key
//

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PracticePropertiesFile {
    public static void main (String[] args) {
        String path = "/Users/turker/Desktop/Class Notes/Java/19Properties File/testdata.properties";
        System.out.println (getData ( "Brand",path ));
        System.out.println (getData ( "Model",path ));
        System.out.println (getData ( "Year",path ));
        System.out.println (getData ( "Color",path ));
    }

    public static String getData(String key,String path){
        Properties property = new Properties (  );
        try {
            FileInputStream file = new FileInputStream (path); // we calling path
            property.load ( file );// we embeding file to use property class
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return property.getProperty ( key );
    }
}
