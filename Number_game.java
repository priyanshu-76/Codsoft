import java.util.*;
public class Number_game {
    public static void main(String []args){
        int chance=6;
        int win=0;
        boolean p_again=true;
        System.out.println("Heyy dude!");
        System.out.println("You can change your luck in "+ chance +" chances.");
        while(p_again){
            int num = (int) (Math.random() * 100);//random number in range of 100
            boolean guess=false;
            Scanner sc=new Scanner(System.in);
            int i=0;
            do{
               
                System.out.println("chance "+ (i+1)+": Enter your guess:");
                int u_guess=sc.nextInt();
                if(u_guess==num){
                    guess=true;
                    win+=1;
                    System.out.println("You got it champ!!");
                    break;
                }
                else if(u_guess>num){
                    System.out.println("Too high");
                }
                else
                System.out.println("Too low");
                i++;

            }while(i<chance);
            if(guess==false){
                System.out.println("Oops,you lost it!");
                System.out.println("The number is : "+ num);
            }
            System.out.println("Do you want to play again(y/n)");
            String p=sc.next();
            p_again=p.equalsIgnoreCase("y");
            //if equals to "y",then play again
        }
        System.out.println("That's it Buddy, Hope you enjoyed it!");
        System.out.println("Your score is: " + win);
    }
}
