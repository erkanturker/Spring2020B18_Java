package Replit;

public class RPizzaa {
    private String size;
    private int cheeseToppings;
    private int peperoniToppings;
    private int hamToppings;

    public RPizzaa(String size,int cheeseToppings,int peperoniToppings,int hamToppings){
        this.size=size;
        this.cheeseToppings=cheeseToppings;
        this.peperoniToppings= peperoniToppings;
        this.hamToppings=hamToppings;
    }

    public String getSize ( ) {
        return size;
    }

    public void setSize (String size) {
        this.size = size;
    }

    public int getCheeseToppings ( ) {
        return cheeseToppings;
    }

    public void setCheeseToppings (int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPeperoniToppings ( ) {
        return peperoniToppings;
    }

    public void setPeperoniToppings (int peperoniToppings) {
        this.peperoniToppings = peperoniToppings;
    }

    public int getHamToppings ( ) {
        return hamToppings;
    }

    public void setHamToppings (int hamToppings) {
        this.hamToppings = hamToppings;
    }
    public double calcCost(){
        double total=0;
        if(size.equalsIgnoreCase ( "Small" )){
            total= 10 + (cheeseToppings*2)+(peperoniToppings*2)+(hamToppings*2);
        }
        else if(size.equals ( "Medium" )){
            total= 12 + (cheeseToppings*2)+(peperoniToppings*2)+(hamToppings*2);
        }
        else if (size.equals ( "Large" )) {
            total= 14 + (cheeseToppings*2)+(peperoniToppings*2)+(hamToppings*2);
        }

        return total;
    }
    public String getDescription(){
        String descripiton= size+" Pizza with "+cheeseToppings+" Cheese toppings, "
                +peperoniToppings+" Pepperoni toppings, and "+hamToppings+" Ham toppings.\n" +
                "Total Price: "+calcCost ();
        return descripiton;
    }

    public static void main (String[] args) {
        RPizzaa obj= new RPizzaa ( "Medium",2,2,1 );
        System.out.println (obj.calcCost ());
        System.out.println (obj.getDescription ());
    }


}
