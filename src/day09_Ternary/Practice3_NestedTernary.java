package day09_Ternary;

import java.util.Scanner;

public class Practice3_NestedTernary {
    // dikdörtgenin en boy değerlerini alın.Girilen değerlere göre kare olup olmadığını yazdırın
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. kenarı giriniz");
        double kenar1=scan.nextDouble();
        System.out.println("Lütfen 2. kenarı giriniz");
        double kenar2=scan.nextDouble();
        System.out.println(kenar1==kenar2?"Kare":"Kare değildir");




    }
}
