package day09;

import java.util.Scanner;

public class Practice4_NestedTernary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi= scan.nextDouble();
        System.out.println(sayi>=100 && sayi<1000?"üç basamaklı sayı":"Üç basamaklı değildir");
    }
}
