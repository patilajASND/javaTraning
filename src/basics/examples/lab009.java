package src.basics.examples;

import java.util.Scanner;

public class lab009 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number");
        int x=sc.nextInt();
        if((x%3==0)&&(x%5==0)) {
            System.out.println(" it is a Fizz and buzz ");
        } else if (x%5==0) {
            System.out.println(" it is a buzz");
        }else if((x%3==0)){
            System.out.println("it is Fizz");
        }else{
            System.out.println("it is not divisible by 3 and 5");
        }

    }
}
