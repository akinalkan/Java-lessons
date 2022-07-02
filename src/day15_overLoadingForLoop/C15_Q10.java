package day15_overLoadingForLoop;

import java.util.Scanner;

public class C15_Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz");
        int sayi2 = scan.nextInt();
        int toplam = 0;
        if (sayi1 < sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;

            }
            System.out.println(toplam);


        } else if (sayi1 > sayi2) {
            for (int i = sayi2; i <= sayi1; i++) {
                toplam += i;

            }
            System.out.println(toplam);

        } else {
            System.out.println("Lutfen farkli iki sayi giriniz");
        }


    }
}
