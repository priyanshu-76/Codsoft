import java.util.*;

public class ATM{
    //attributes
    int pin=4001;
    int count=0;
    float Balance=2500;

    public void c_pin(){
      if(count>5)
      System.out.print("You lost your chances for security reasons\n" +"Try after 3 hours again\n");
          System.out.println("PIN :");
          Scanner sc=new Scanner(System.in);
          int Pin=sc.nextInt();
          if(Pin==pin){
            count++;
          menu();
        }
          else{
            count++;
          System.out.println("Enter a valid pin.");
         c_pin();
         }
         
    
   }
    public void menu(){
         System.out.println("enter your choices:");
         Scanner sc=new Scanner(System.in);
         int opt=sc.nextInt();
         if(opt!=4){
         System.out.println("1.Check a/c balance:");
         System.out.println("2.Withdraw amt.");
         System.out.println("3.Deposit money");
         System.out.println("4. EXIT");
         }
        
         
            switch(opt){
                case 1: C_balance();
                break;
                case 2: Withdraw_amt();
                break;
                case 3: D_money();
                break;
                case 4:  System.out.println("Thank you for using our ATM. Goodbye!");
                System.exit(0); 
                
                default: System.out.println("Please, Enter a valid number.");
         }
      }
         public void C_balance(){
            System.out.println("BALANCE : "+Balance);
            menu();
         }
         public void Withdraw_amt(){
            System.out.println("Enter amt to withdraw:");
            Scanner sc=new Scanner(System.in);
            float amt=sc.nextFloat();
            if(amt>Balance){
                System.out.println("Insufficient Balance");
            }
            else{
                Balance=Balance-amt;
                System.out.println("Money withdrawl Successful");

            }
            C_balance();
            menu();
         }
         public void D_money(){
            System.out.println("Enter the amount:");
            Scanner sc=new Scanner(System.in);
            float amt=sc.nextFloat();
            Balance+=amt;
            System.out.println("Money deposited successfully");
            C_balance();
            menu();
         }
         
    
   
    public static void main(String args[]){
       ATM a=new ATM();
       a.c_pin();

    }
}