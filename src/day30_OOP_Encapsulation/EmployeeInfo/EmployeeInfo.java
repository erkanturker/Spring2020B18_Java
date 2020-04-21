package day30_OOP_Encapsulation.EmployeeInfo;

public class EmployeeInfo {
    /*
    name SSN Age Salary
     */
   private String Name;
   private long SSN;
   private byte Age;
   private double Salary;
public EmployeeInfo(String Name, long SSN, byte Age, double Salary){
    this.Name=Name;
    this.SSN=SSN;
    this.Age=Age;
    this.Salary=Salary;
}

   public void setName(String Name){
       this.Name=Name;
   }



   public String getName(){

       return Name;
   }

   public void setSSN(long SSN){
       this.SSN=SSN;
   }

   public long getSSN(){
       return SSN;
   }

   public void setAge(byte Age){
       this.Age=Age;
   }
   public byte getAge(){
       return Age;
   }

   public void setSalarySalary (double Salary){
       this.Salary=Salary;
   }
   public double getSalary(){
       return Salary;
   }

   public void getAll(){
       System.out.println(getName()+" "+getSSN()+" "+getAge()+" "+getSalary());
   }

}
