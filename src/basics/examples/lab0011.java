package src.basics.examples;

import java.util.Scanner;

public class lab0011 {

   // ************************  Factorial Number  ************************************
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
         int n= sc.nextInt();
         int fact=1;
         while(n>0){

             fact*=n;
             n--;
        }
        System.out.println(fact);

    }
}
