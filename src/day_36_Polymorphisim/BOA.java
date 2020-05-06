package day_36_Polymorphisim;

import java.util.ArrayList;
import java.util.Arrays;

/*
WarmUp:
	1. create an abstract class called ScrumTeam
			Data: Name
				  JobTitile
				  Salary

			Actions: DailyStandUp();
					 Demo();

	2. Create the following sub classes of ScrumTeam:
				1. Testers:
						Actions: FindBug

				2. Developers:
						Actions: FixBug

	3. Create a class called BOA
			create Array of Testers named sdets, at leats store two objects
			create array of Developers named dev, at least store three objects

			create ArrayList of ScrumTeam:
					store all the developer' and testers' objects
 */
abstract class ScrumTeam {
    public String name, jobtitle;
    public double salary;

    public abstract void DailyStanup ( );

    public abstract void Demo ( );
    public void getEmpleyeeInfo () {
        System.out.println ( "=====================" );
        System.out.println ( "Employee name: " + name );
        System.out.println ( "Job Title: " + jobtitle );
        System.out.println ( "Salary: " + salary );
        System.out.println ( "=====================" );

    }


}

class Tester extends ScrumTeam {
    public Tester (String name, String jobtitle, double salary) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;



    }

    @Override
    public void DailyStanup ( ) {
        System.out.println ( "Tester " + name + " is talking" );
    }

    @Override
    public void Demo ( ) {
        System.out.println ( "Tester " + name + " is doing demo" );
    }


}
class Developers extends ScrumTeam{
    public Developers ( String name, String jobtitle,double salary) {
        this.name=name;
        this.jobtitle=jobtitle;
        this.salary=salary;
    }

    @Override
    public void DailyStanup ( ) {
        System.out.println ( "Developer " + name + " is talking" );
    }

    @Override
    public void Demo ( ) {
        System.out.println ( "Developer " + name + " is doing demo" );
    }
}

public class BOA {
    public static void main (String[] args) {
        ScrumTeam tester1 = new Tester ( "Erkan", "tester", 200000 );
        ScrumTeam tester2 = new Tester ( "Asim","Automation Tester",150000 );
        ScrumTeam tester3 = new Tester ( "Asim","Manual Tester",700000 );

        ScrumTeam developer1 = new Developers ( "Zehra","Senior Developers",150000 );
        ScrumTeam developer2 = new Developers ( "Asim","Junior Developers",110000 );
        ScrumTeam developer3 = new Developers ( "Zehra","Freshman Developers",140000 );

        ScrumTeam [] testers = { tester1,tester2,tester3};


        for (ScrumTeam eachtester:testers) {
            eachtester.getEmpleyeeInfo ();
        }

        ScrumTeam [] developers= {developer1,developer2,developer3};
        for (ScrumTeam eachDev: developers) {
            eachDev.getEmpleyeeInfo ();
        }

        ArrayList<ScrumTeam>scrumTeamArrayList = new ArrayList<> (  );
        scrumTeamArrayList.addAll ( Arrays.asList (testers) );
        scrumTeamArrayList.addAll ( Arrays.asList ( developers ) );

        for (ScrumTeam each:scrumTeamArrayList) {
            each.getEmpleyeeInfo ();
        }

    }
}
