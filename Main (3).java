//Input a number and print all the factors of that number (use loops)

import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        System.out.println("enter no to get its factor");
        int n=in.nextInt();
        System.out.print("The factors of "+n+" are: ");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
              System.out.print(+i+" ");
            }
        }
    }
}