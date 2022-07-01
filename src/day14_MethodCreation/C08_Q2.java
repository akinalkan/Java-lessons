package day14_MethodCreation;

import java.util.Scanner;

public class C08_Q2 {

    public static void main(String[] args) {

        int toplam = sayiTopla();


    }

    public static int sayiTopla() {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Kac sayi toplamak istiyorsunuz: ");
        int adet = scan.nextInt();
        switch (adet) {
            case 2 -> {
                System.out.print("Lutfen 1.sayiyi giriniz: ");
                int sayi1 = scan.nextInt();
                System.out.print("Lutfen 2.sayiyi giriniz: ");
                int sayi2 = scan.nextInt();
                toplam = sayi1 + sayi2;
                System.out.print("Girilen sayilar toplami: " + toplam);

                return toplam;
            }
            case 3 -> {
                System.out.print("Lutfen 1.sayiyi giriniz: ");
                int sayi1 = scan.nextInt();
                System.out.print("Lutfen 2.sayiyi giriniz: ");
                int sayi2 = scan.nextInt();
                System.out.print("Lutfen 3.sayiyi giriniz: ");
                int sayi3 = scan.nextInt();
                toplam = sayi1 + sayi2 + sayi3;
                System.out.print("Girilen sayilar toplami: " + toplam);
                return toplam;


            }
            case 4 -> {
                System.out.print("Lutfen 1.sayiyi giriniz: ");
                int sayi1 = scan.nextInt();
                System.out.print("Lutfen 2.sayiyi giriniz: ");
                int sayi2 = scan.nextInt();
                System.out.print("Lutfen 3.sayiyi giriniz: ");
                int sayi3 = scan.nextInt();
                System.out.print("Lutfen 4.sayiyi giriniz: ");
                int sayi4 = scan.nextInt();
                toplam = sayi1 + sayi2 + sayi3 + sayi4;
                System.out.print("Girilen sayilar toplami: " + toplam);
                return toplam;


            }
            default -> System.out.println("Lutfen 2 ,3 yada 4 adet sayi toplayiniz");
        }


        return toplam;
    }


}
