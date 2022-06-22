package day09_Ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gün numarısını alıp
        1 ise pazartesi
        ...
        7 ise pazar yazdıralım
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo=scan.nextInt();

        /* switch yanına yazılan () neye göre case atayacağımızı gösterir
        Java girilen değere göre case'i bulur ve o satırdan çalıştırmaya başlar
        break yazısı görünceye kadar veya switch parantezine kadar çalışır
        if else if .... else yapısında olduğu gibi hiç bir şarta uymayanları
        default keyword kullanılır
         */

        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;

            default:
                System.out.println("Geçersiz giriş");



        }
    }
}
