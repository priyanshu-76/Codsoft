import java.util.*;


public class calculator {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=6;//number of subjects
    int sum=0;
    for(int i=1;i<=6;i++){
        System.out.println("enter the marks for S"+i);
        float s=sc.nextFloat();
        sum+=s;
    }
    System.out.println("Marks you got:"+sum);
    int avg=sum/(n);
    System.out.println("The average % is:"+avg+"%");
    if(avg>=90)
    System.out.println("GRADE O");
    else if(avg<90 && avg>=80)
    System.out.println("GRADE E");
    else if(avg>=75 && avg<80)
    System.out.println("GRADE A");
    else if(avg>=65 && avg<75)
    System.out.println("GRADE B");
    else if(avg>=55 && avg<65)
    System.out.println("GRADE C");
    else if(avg>=40 && avg<55)
    System.out.println("GRADE D");
    else if(avg<40)
    System.out.println("FAIL");
    else
    System.out.println("ERROR");
}
}
