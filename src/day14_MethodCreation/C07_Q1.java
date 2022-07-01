package day14_MethodCreation;

import java.util.Scanner;

public class C07_Q1 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin.Bu sayinin
        tek mi cift mi oldugunu,
         sifirdan buyuk mu kucuk mu oldugunu,
         ayrica ve 100'den buyukse birler onlar ve yuzler basamagindaki rakamlarin toplamini,
        100'den kucukse sadece birler basamagini yazdiran
        3 methot olusturun

         */

        int sayi1 = tekCiftSayi();
        int sayi2 = sifirdnBuyukKucukSayi();
        int sayi3 = durumuYuzeBagliSayi();
    }

    public static int tekCiftSayi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int input3 = scanner.nextInt();

        if (input3 % 2 == 0) {
            System.out.println(input3 + " cift sayidir");

        } else {
            System.out.println(input3 + " tek sayidir");
        }
        return input3;
    }


    public static int sifirdnBuyukKucukSayi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int input2 = scanner.nextInt();

        if (input2 < 0) {
            System.out.println(input2 + " 0'dan kucuktur");

        } else {
            System.out.println(input2 + " 0'dan buyuktur");
        }
        return input2;
    }


    public static int durumuYuzeBagliSayi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");
        int sayi = scan.nextInt();
        if (sayi > 100) {
            int birlerBasamak = 0;
            int rakamToplam = 0;
            birlerBasamak = sayi % 10;
            rakamToplam += birlerBasamak;
            sayi /= 10;
            birlerBasamak = sayi % 10;
            rakamToplam += birlerBasamak;
            sayi /= 10;
            birlerBasamak = sayi % 10;
            rakamToplam += birlerBasamak;
            System.out.println("sayi 100'den buyuk sayinin son uc basamak toplami : " + rakamToplam);
        } else {
            int birlerBasamkIki = sayi % 10;
            System.out.println("sayi 100 den kucuk birler basamagi : : " + birlerBasamkIki);

        }
        return sayi;
    }
}