package day03_scanner;


import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        /*
        kullanıcıdan iki sayı alıp
        bu sayıların çarpımını yazdırın
         */
        //1.adım

        Scanner scan = new Scanner(System.in);

        //2.adım
        System.out.println("Lütfen ilk sayıyı girin");
        double sayi1 = scan.nextDouble();
        //2. sayı için 2. ve 3. adımları tekrarlarız

        System.out.println("Lütfen 2. sayıyı girin");
        double sayi2 = scan.nextDouble();
        System.out.println("Girilen sayıların çarpımı: " + sayi1 * sayi2);


    }
}
