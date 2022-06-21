package day03_scanner;

import java.util.Scanner;

public class C13_Work5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");

        String soyisim = scan.nextLine();
        System.out.println("İsminiz:\t" + isim);
        System.out.println("Soyisminiz:\t" + soyisim);
        System.out.println("Kursumuza katılımınız alınmıştır,teşekkür ederiz");


    }
}
