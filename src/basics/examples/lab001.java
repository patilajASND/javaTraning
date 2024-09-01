package src.basics.examples;

import java.util.Scanner;

public class lab001 {
    public static void main(String[] args) {
           // wjpm to identify the verify the given in put is "even" or "odd"
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Give ur Number");
        int num =sc.nextInt();

        switch (num%2){
            case 0:
                System.out.println(num +"  it is a even Number");
                break;
            case 1:
                System.out.println(num +"  it is a  odd Number");
                break;
        }

    }
}
