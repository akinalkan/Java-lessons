package day09_Ternary;

import java.util.Scanner;

public class C08_SwitchCasePractice_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scan.nextInt();

        switch (sayi) {
            case 10 -> System.out.println("İki basamaklı en küçük sayı");
            case 100 -> System.out.println("Üç basamaklı en küçük sayı");
            case 1000 -> System.out.println("Dört basamaklı en küçük sayı");
            default -> System.out.println("Girdiğin sayıyı değiştir");
        }




    }
}
