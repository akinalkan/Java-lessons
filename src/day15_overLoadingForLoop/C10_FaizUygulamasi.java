package day15_overLoadingForLoop;

import java.util.Scanner;

public class C10_FaizUygulamasi {
    public static void main(String[] args) {
         /*
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.

        Faiz Oranı : %6 Faiz Oranı

        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bankamiza hosgeldiniz.Fazi orani %6");
        int anapara, vade;
        System.out.print("Yatirmak istediginiz tutar: ");
        anapara = scan.nextInt();
        System.out.print("Paranizi kac yil vadelli yatirmak istiyorsunuz: ");
        vade = scan.nextInt();

        double toplampara = anapara;
        double faizOrani = 0.06;


        for (int i = 1; i <= vade; i++) {
            toplampara = (toplampara * faizOrani) + toplampara;

            System.out.println(i + "yilin sonunda toplam para : " + (int)toplampara);
        }


    }
}
