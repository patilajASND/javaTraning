package src.basics.examples;

import java.util.Scanner;

public class lab0012 {

    //************** even num form 1 to n lets say n is 20*****************************
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num =1;
        while(num<=n){

            if(num%2==0) {
                System.out.println(num +"is even number");
            }
                  num++;

        }
    }
}
