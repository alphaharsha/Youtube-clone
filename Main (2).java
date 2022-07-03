/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

// Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int max=0;
      int arr[]=new int[100];
      Scanner in=new Scanner(System.in);
      for(int j=0;j<10;j++)
      {
         arr[j]=in.nextInt();
         if(max<arr[j])
         {
           max=arr[j];
         }
       else
       {
           max=max; 
       }
      }
     
      System.out.println(max);
    }
}