package day06_Shorthand_LocigalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean r1 ="Corona virus " != "End of the World" && "Toilet paper " == "Cure";
        System.out.println(r1);
        boolean r2 =10>15 && 15<12;
        System.out.println(r2);
        boolean r3 = 'a'== 'b'-1 && 'b'+1 == 'c';
        System.out.println(r3);

        boolean r4 =true != false || false==!true;
        System.out.println(r4);
        boolean r5 =true != false && !false==!true;
        System.out.println(r5);

        boolean r6 =!!!!false;
        System.out.println(r6);
    }
}
