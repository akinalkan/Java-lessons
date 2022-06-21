package day08_ifStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("1. sayıyı giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("2. sayıyı giriniz");
        double sayi2= scan.nextDouble();
        System.out.println(sayi1!=sayi2?sayi1>sayi2?sayi2:sayi1:"Lütfen 2 farklı sayı giriniz");
    }
}
