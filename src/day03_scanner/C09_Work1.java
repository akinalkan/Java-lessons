package day03_scanner;

import java.util.Scanner;

public class C09_Work1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz ve\n Enter tuşuna basınız \nsonra 2. sayıyı giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("Girilen sayıların toplamı:\t"+(sayi1+sayi2));
        System.out.println("Girilen sayıların farkı:\t"+(sayi1-sayi2));
        System.out.println("Girilen sayıların çarpımı:\t"+(sayi1*sayi2));





    }
}
