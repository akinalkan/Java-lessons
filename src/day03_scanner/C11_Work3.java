package day03_scanner;

import java.util.Scanner;

public class C11_Work3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yarıçap değeri giriniz");

        double pi = Math.PI;

        double yariCap = scan.nextDouble();
        System.out.println("Çemberin çevresi: " + (2 * pi * yariCap));
        System.out.println("Dairenin alanı: " + (pi * yariCap * yariCap));

    }
}
