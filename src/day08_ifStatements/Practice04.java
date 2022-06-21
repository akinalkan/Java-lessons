package day08_ifStatements;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi= scan.nextDouble();
        System.out.println(sayi!=0?sayi<0?(sayi*sayi) :"Sayı pozitif":"Lütfen 0'dan faklı birsayı giriniz:");
    }
}
