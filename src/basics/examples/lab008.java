package src.basics.examples;

import java.util.Scanner;

public class lab008 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Your No.");
        int a = sc.nextInt();
        String b = (a==1)?"Jan 31 days":(a==2)?"Feb 28 Days":(a==3)?"March 31 Days":(a==4)?"April 30 Days"
                :(a==5)?"May 31 Days":(a==6)?"June 30 Days":(a==7)?"March 31 Days":(a==7)?"July 31 Days"
                :(a==8)?"August 31 Days":(a==9)?"September 30 Days":(a==10)?"October 31 Days":(a==11)?"November 30 Days"
                :(a==12)?"December 31 Days":"Invalid Month Selected";
        System.out.println("Your Output is :"+b);
    }
}



