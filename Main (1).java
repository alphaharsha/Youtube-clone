/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

//sum all Integer until user entrs 0
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int sum=0;
      int arr[]=new int[100];
      Scanner in=new Scanner(System.in);
      for(int j=0;j>-1;j++)
      {
         arr[j]=in.nextInt();
         if(arr[j]==0)
         {
           break;
         }
         sum=sum+arr[j];
      }
     
      System.out.println(sum);
    }
}