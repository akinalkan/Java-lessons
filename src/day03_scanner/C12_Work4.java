package day03_scanner;

import java.util.Scanner;

public class C12_Work4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdörtgenler prizmasının kısa kenarını giriniz");
        double kisaKenar = scan.nextDouble();
        System.out.println("Dikdörtgenler prizmasının uzun kenarını giriniz");
        double uzunKenar = scan.nextDouble();
        System.out.println("Dikdörtgenler prizmasının yüksekliğini kenarını giriniz");
        double yükseklik = scan.nextDouble();
        System.out.println("Prizmanın hacmi:\t" + (kisaKenar * uzunKenar * yükseklik));


    }
}
