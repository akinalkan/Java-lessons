package day12_stringManipulations;

import java.util.Scanner;

public class C07_webSorusu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ad giriniz");
        String ad = scan.nextLine();
        String harf1 = ad.substring(0, 1);
        String harf2 = ad.substring(1, 2);
        String harf3 = ad.substring(2, 3);

        if (ad.length() != 3) {
            System.out.println("adın uzunlugu 3 olmalidir");

        } else {
            if (harf1.equals(harf2) || harf1.equals(harf3) || harf2.equals(harf3)) {
                System.out.println("isim ayni karakterlere sahiptir.");

            } else {
                System.out.println("Dizenin benzersiz karakterleri var");

            }
        }
    }
}