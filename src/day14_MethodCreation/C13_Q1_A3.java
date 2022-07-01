package day14_MethodCreation;

import java.util.Scanner;

public class C13_Q1_A3 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin.Bu sayinin
        1-tek mi cift mi oldugunu,
        2- sifirdan buyuk mu kucuk mu oldugunu,
        3- 100'den buyukse birler onlar ve yuzler basamagindaki rakamlarin toplamini,
            100'den kucukse sadece birler basamagini yazdiran
             3 methot olusturun

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int input = scanner.nextInt();
        tekMiCiftMi(input);
        System.out.print(" ve ");
        pozitifMiNegatifMi(input);
        System.out.print(" , ");
        sayiKontrol(input);


    }

    public static void tekMiCiftMi(int input) {


        if (input % 2 == 0) {
            System.out.print(input + " cift sayidir");

        } else {
            System.out.print(input + " tek sayidir");
        }
    }

    public static void pozitifMiNegatifMi(int input) {
        if (input > 0) {
            System.out.print( " pozitif");
        } else if (input == 0) {
            System.out.print(input);

        } else {
            System.out.print(" negatif");
        }
    }

    public static void sayiKontrol(int input) {
        if (input < 100) {
            System.out.print("birler basamagi :" + input % 10+" dir");
        } else {
            int rakamlarToplami = input % 10;
            input /= 10;
            rakamlarToplami += input % 10;
            input /= 10;
            rakamlarToplami += input;
            System.out.print("rakamlar toplami :" + rakamlarToplami+" dir");
        }
    }
}
