package src.basics.examples;

import java.util.Scanner;

public class lab007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int costPrice =sc.nextInt();
        if(costPrice>100000){
            System.out.println("You need to pay 15% tax");
        } else if ((costPrice>50000)&& (costPrice<=100000)) {
            System.out.println("You need to pay 10% tax");
        } else if (costPrice<=50000) {
            System.out.println("You need to pay 5% tax");
            
        }
    }
}
