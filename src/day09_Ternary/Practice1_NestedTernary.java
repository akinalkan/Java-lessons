package day09_Ternary;

import java.util.Scanner;

public class Practice1_NestedTernary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi= scan.nextDouble();
        System.out.println(sayi>=10? sayi<100 ?"2 basamaklı sayı":"3 basamaklı veya daha büyük sayı":"rakam");

    }
}
