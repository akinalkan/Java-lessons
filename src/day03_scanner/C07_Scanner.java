package day03_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        /* tek seferde kullanıcıdan tüm bilgileri alınız*/

        System.out.println("Lütfen isminizi,soyisminizi ve yaşınızı giriniz \naralarda Enter tuşuna basınız");
        String isim=scan.nextLine().toUpperCase(Locale.ROOT);
        String soyisim= scan.nextLine().toLowerCase(Locale.ROOT);
        double yas=scan.nextDouble();

        System.out.println("Girilen bilgiler : " + isim+"\t" + soyisim+"\t" + yas);



    }
}
