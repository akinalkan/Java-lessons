package day09;

import java.util.Scanner;

public class Practice5_IfElseStatements {
    public static void main(String[] args) {
        /*
        Bir kişinin mağazadan 100 TL ve üzeri alışveriş yaparsa %10 indirim,
        200 TL ve üzeri alışveriş yaparsa %15 indirim,
        300 TL ve üzeri alışveriş yaparsa %20 indirim kazandığını ve
        ödeyeceği miktarı ekrana yazdıran Java kodlarını yazınız
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen alışveriş yaptığınız TL miktarını giriniz");
        double tl = scan.nextDouble();
        if (tl < 100) {
            System.out.println("Yine bekleriz");
        }
        else if (tl >= 100 && tl < 200) {
            System.out.println("Tebrikler %10 indirim kazandınız");
            System.out.println("Ödeyeceğiniz miktar: " + (tl * 0.9));
            System.out.println("Kazanılan indirim miktarı: " + (tl *0.1));

        } else if (tl >= 200 && tl < 300) {
            System.out.println("Tebrikler %15 indirim kazandınız");
            System.out.println("Ödeyeceğiniz miktar: " + (tl * 0.85));
            System.out.println("Kazanılan indirim miktarı: " + (tl * 0.15));

        } else if (tl >= 300) {
            System.out.println("Tebrikler %20 indirim kazandınız");
            System.out.println("Ödeyeceğiniz miktar: " + (tl * 0.80));
            System.out.println("Kazanılan indirim miktarı: " + (tl * 0.20));

        } else {
            System.out.println("Lütfen geçerli bir tutar giriniz");
        }

    }
}
