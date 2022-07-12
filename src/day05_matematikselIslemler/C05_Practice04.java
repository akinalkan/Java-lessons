package day05_matematikselIslemler;

import java.util.Scanner;

public class C05_Practice04 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 4 basamaklı pozitif bir sayi giriniz");
        int sayi= scan.nextInt();
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int geciciSayi=sayi;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        System.out.println(geciciSayi+" sayisinin rakamlari toplami: "+ rakamlarToplami);
        System.out.println("************************************");
        System.out.println();
        //while ile rakamlar toplami..........


        System.out.println("Lütfen 4 basamaklı pozitif bir sayi giriniz");
        int sayiNew= scan.nextInt();
        int rakm;
        int rk=0;
        while(sayiNew>0) {
           rakm=sayiNew%10;
           rk+=rakm;
           sayiNew/=10;

        }
        System.out.println(rk);





    }
}
