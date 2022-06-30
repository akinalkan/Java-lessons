package day09_Ternary;

import java.util.Scanner;

public class C07_SwitchCasePractice_1 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan kaçıncı ay olduğunu sorun ve ay ismini yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaçıncı ay olduğunu giriniz(1-2..12)");
        int ay = scan.nextInt();
        switch (ay) {
            case 1 -> System.out.println("Ocak");
            case 2 -> System.out.println("Şubat");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Nisan");
            case 5 -> System.out.println("Mayıs");
            case 6 -> System.out.println("Haziran");
            case 7 -> System.out.println("Temmuz");
            case 8 -> System.out.println("Ağustos");
            case 9 -> System.out.println("Eylül");
            case 10 -> System.out.println("Ekim");
            case 11 -> System.out.println("Kasım");
            case 12 -> System.out.println("Aralık");
            default -> System.out.println("Lütfen geçerli bir sayı giriniz");
        }


    }
}
