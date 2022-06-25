package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        /*
        kullanıcıdan isim soyisim ve yaşını alıp
        girilen bilgiler =seyfi çapar 34 şeklinde yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi yazınız");

        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi yazınız");
        String soyisim = scan.nextLine();

        System.out.println("Lütfen yaşınızı yazınız");

        double yas = scan.nextDouble();
        System.out.println("Girilen bilgiler : " + isim+"\t" + soyisim+"\t" + yas);




    }
}
