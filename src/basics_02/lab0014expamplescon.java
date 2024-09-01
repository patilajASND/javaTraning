package src.basics_02;

import java.util.Scanner;

public class lab0014expamplescon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your mesurment");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();

        if ((side1==side2)&& (side2==side3)&&(side1==side3)){
            System.out.println("it is equlateral Trangle");
        } else if ((side1==side2)||(side2==side3)||(side1==side3)){
            System.out.println("it is a isoscles");
        }else {
            System.out.println("scalne");
        }
    }
}
