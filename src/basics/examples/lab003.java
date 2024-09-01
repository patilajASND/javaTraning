package src.basics.examples;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab003 {
    //********* WAJP to read the three integer value from user and print smallest one====*******
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Your Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if((a<b)&&(a<c)){
            System.out.println("A  is a Smallest number  "+ a);
        } else if (b<c) {
            System.out.println("B  is a Smallest number  "+ b);
        }else {
            System.out.println("C  is a Smallest number  "+ c);
        }

    }
}
