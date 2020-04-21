package day24_ArrayListContinue;

/* Making musician  list user will add music
   Will be update the list accourding to index number and Delete
   User can find a musician on the list

 */


import java.util.ArrayList;
import java.util.Scanner;

public class MusicArraylist {
    static ArrayList<String> musicianList=new ArrayList<String>();
    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
    boolean exit = true;
    Transaction();
    while (exit){
        System.out.println("Please Select your Transaction");
        String transaction= scanner.nextLine();
        switch (transaction){
            case "1":
                Transaction();
                break;
            case "2":
                addMuscian();
                break;
            case "3":
                ShowMusician();
                break;
            case "4":
                UpdateMusican();
                break;
            case "5":
                DeleteMusican();
                break;case "6":
                deleteArrayList();
                break;
            case "q":
                System.out.println("Leaving from the app");
                exit=false;
                break;
            default:
                System.out.println("Invalid Entery");
                break;
        }

    }

    }



    public static void addMusicianList(String name){
        musicianList.add(name);
        System.out.println(name+" was added on your list");
    }
    public static void addMuscian(){
        System.out.println("Input musican Name");
        String name = scanner.nextLine();
        addMusicianList(name);
    }
    public static void ShowMusician(){
        System.out.println("You have "+musicianList.size()+" musicans");
        for (int i = 0; i <musicianList.size() ; i++) {
            System.out.println(i+1+" "+musicianList.get(i));
        }
    }

    public static void UpdateMusican(){
        System.out.println(" Please enter the name you want to update musican ");
        String name=scanner.nextLine();
        int indexNo= musicianList.indexOf(name);

        if(indexNo>=0){
            System.out.println(" Please enter new Muscian name");
            name=scanner.nextLine();
            musicianList.set(indexNo,name);
            System.out.println(name+" was add on your list");
        }
        else System.out.println("The musican could not find");

    }

    public static void DeleteMusican(){
        System.out.println("Please enter the name you want to delete ");
        String name = scanner.nextLine();
        int indexnumber= musicianList.indexOf(name);
        System.out.println(indexnumber);
        if(indexnumber>=0){
            musicianList.remove(0);
            System.out.println(name+" was deleted in your list ");
        }
        else System.out.println("The musician could not find ");
    }
    public static void deleteArrayList(){

        musicianList.clear();
        System.out.println("Your list is cleaned");

    }


    public static void Transaction(){
        System.out.println(" 1 for Trasaction ");
        System.out.println(" 2 for Add Names");
        System.out.println(" 3 for Show Musicians");
        System.out.println(" 4 for Update Muscians");
        System.out.println(" 5 for Delete the Musican");
        System.out.println(" 6 for Delete All List");
    }
}
