package recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    public static void main(String[] args) {
        // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 3 hanerli pozitif bir tamsayı giriniz : ");
        int sayi = scan.nextInt();
        if (sayi <= 999 && sayi >= 100) {
            int birler, onlar, yuzler;

            birler = sayi % 10;
            sayi /= 10;
            onlar = sayi % 10;
            sayi /= 10;
            yuzler = sayi % 10;
            System.out.print("Girilen sayının okunuşu: ");
            switch (yuzler) {
                case 1 -> System.out.print("yüz\t");
                case 2 -> System.out.print("ikiyüz\t");
                case 3 -> System.out.print("üçyüz\t");
                case 4 -> System.out.print("dörtyüz\t");
                case 5 -> System.out.print("beşyüz\t");
                case 6 -> System.out.print("altıyüz\t");
                case 7 -> System.out.print("yediyüz\t");
                case 8 -> System.out.print("sekizyüz\t");
                case 9 -> System.out.print("dokuzyüz\t");


            }


            switch (onlar) {
                case 1 -> System.out.print("on\t");
                case 2 -> System.out.print("yirmi\t");
                case 3 -> System.out.print("otuz\t");
                case 4 -> System.out.print("kırk\t");
                case 5 -> System.out.print("elli\t");
                case 6 -> System.out.print("altmış\t");
                case 7 -> System.out.print("yetmiş\t");
                case 8 -> System.out.print("seksen\t");
                case 9 -> System.out.print("doksan\t");
                case 0 -> System.out.print("\t");

            }
            switch (birler) {
                case 1 -> System.out.print("bir\t");
                case 2 -> System.out.print("iki\t");
                case 3 -> System.out.print("üç\t");
                case 4 -> System.out.print("dört\t");
                case 5 -> System.out.print("beş\t");
                case 6 -> System.out.print("altı\t");
                case 7 -> System.out.print("yedi\t");
                case 8 -> System.out.print("sekiz\t");
                case 9 -> System.out.print("dokuz\t");
                case 0 -> System.out.print("\t");
            }

        } else {
            System.out.println("Lütfen 3 basamaklı pozitif bir tamsayı giriniz!");
        }


    }
}
