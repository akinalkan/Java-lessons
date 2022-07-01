package day14_MethodCreation;

import java.util.Scanner;

public class C14_Q2_A2 {
    public static void main(String[] args) {
        /*
        Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
        Kullanici 2,3 veya 4 degerini girerse,
        kullanicidan bu sayilari girmesini isteyin ve
        sayilarin toplamini yazdirin.
        Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse
        "Cok sayi girdiniz, ben toplayamam" yazdirin.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen kac sayi toplamak istediginizi giriniz: ");
        int sayiAdedi = scan.nextInt();
        sayiToplama(sayiAdedi);

    }

    public static void sayiToplama(int sayiAdedi) {
        Scanner scan = new Scanner(System.in);

        if (sayiAdedi > 4) {
            System.out.println("Cok sayi girdiniz, ben toplayamam");
        } else if (sayiAdedi == 4) {
            System.out.println("Lutfen toplamak istediginiz 4 sayiyi aralarda entera basarak giriniz");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            System.out.println("Girilen 4 sayinin toplami : " + (a + b + c + d));
        } else if (sayiAdedi == 3) {
            System.out.println("Lutfen toplamak istediginiz 3 sayiyi aralarda entera basarak giriniz");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            System.out.println("Girilen 3 sayinin toplami : " + (a + b + c));
        } else if (sayiAdedi == 2) {
            System.out.println("Lutfen toplamak istediginiz 2 sayiyi aralarda entera basarak giriniz");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Girilen 2 sayinin toplami : " + (a + b));
        } else {
            System.out.println("Lutfen gecerli bir sayi adedi giriniz");
        }


        }
}
