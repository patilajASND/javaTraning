package src.basics.examples;

import java.util.Scanner;

public class lab002 {
    public static void main(String[] args) {
        // WAJP to check user enter month number is valid or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month Number");

        int a=sc.nextInt();
        if((a>0&&a<=12)){
            System.out.println("it is a valid Month ");
        }else{
            System.out.println("it is not a valid Month");
        }

    }
}
