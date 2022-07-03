//Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        System.out.println("enter any number");
        int n=in.nextInt();
        int rem,sum=0,mul=1,res;
        while(n>0)
        {
           rem=n%10;
           sum=sum+rem;
           mul=mul*rem;
           n=n/10;
        }
        res=mul-sum;
      System.out.println("Subtraction of the Product and Sum of Digits of an Integer are: "+res);
    }
}