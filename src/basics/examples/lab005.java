package src.basics.examples;

import java.util.Scanner;

public class lab005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Your Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if((b<a)&&(a<c)){
            System.out.println("A  is a Middle number  "+  a);
        } else if ((a>b)&&(b<c)) {
            System.out.println("B  is a Middle number  "+  b);
        }else {
            System.out.println("C  is a Middle number  "+  c);
        }
    }
}
