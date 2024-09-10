package src.basics.examples;

import java.util.Scanner;

public class lab0013 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num =1;
        int sum=0;
        while(num<=n) {

            if (num % 2 == 0)
                sum += num;
            num++;

        }
        System.out.println(sum);
    }
}
