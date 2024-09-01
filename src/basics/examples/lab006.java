package src.basics.examples;

import java.util.Scanner;
// ************WAJP to read month number from the user and print corresponding month name************
public class lab006 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Give ur Number");
        int num =sc.nextInt();

        switch (num){
            case 1:
                System.out.println(num +"it's  a  january Month");
                break;
            case 2:
                System.out.println(num + "it's a  Feburary Month");
                break;
            case 3:
                System.out.println(num + "it's a  march Month");
                break;
            case 4:
                System.out.println(num + "it's a  april Month");
                break;
            case 5:
                System.out.println(num + "it's a  may Month");
                break;
            case 6:
                System.out.println(num + "it's a june Month");
                break;
            case 7:
                System.out.println(num + "it's a  july Month");
                break;
            case 8:
                System.out.println(num + "it's a  August Month");
                break;
            case 9:
                System.out.println(num + "it's a  september Month");
                break;
            case 10:
                System.out.println(num + "it's a  october Month");
                break;
            case 11:
                System.out.println(num + "it's a november  Month");
                break;
            case 12:
                System.out.println(num + "it's a  December Month");
                break;
        }
    }
}
