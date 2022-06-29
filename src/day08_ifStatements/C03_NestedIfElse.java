package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        /*
        emeklilik kontrolü yapan bir program yazınız
        cinsiyet olarak E(erkek) veya K(kadın) değişkenlerini kabul etsin
        farklı bir harf veya sembol girilirse hata mesajı versin

        emeklilik için kadınlarda yaş sınırı 60
        erkeklerde 65 olsun

        negatif yaş veya 80'den büyük yaş girilirse hata mesajı versin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz" + "\n kadın için K erkek için E harfini giriniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli ys giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsin");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli ys giriniz");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsin");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else {
            System.out.println("Lutfen gecerli bir tercih yaziniz");
        }
    }
}
