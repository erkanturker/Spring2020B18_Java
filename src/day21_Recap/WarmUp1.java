package day21_Recap;

/*
1.Write a method that can convert km to miles
            1 km =0.612

2. Write a method that can convert gallon to litter
        1G = 3.75 L

 */



public class WarmUp1 {
    public static void main(String[] args) {
        KmToMiles(10);
        GallonToLitter(17);
}




    public static void KmToMiles(double Km){
        double miles = Km*0.612;
        System.out.println(miles);

    }
    public static void GallonToLitter(double gallon){
        double Litter = gallon*3.75d;
        System.out.println(Litter);
    }


}

