package day03_scanner;

import java.util.Scanner;

public class C14_Work6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Lütfen isminizi giriniz");

        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");

        String soyisim = scan.nextLine();
        System.out.println("İsim - soyisim:\t" + isim + "\t" + soyisim);

    }
}
