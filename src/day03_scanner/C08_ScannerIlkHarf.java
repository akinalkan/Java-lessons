package day03_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

        //kullanıcıdan ismini alıp ilk harfini büyük harf olarak yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        /*
        java scanner class 'ında nextChar method'u yoktur
        bunun yerine String olarak ilk kelimeyi alıp
        onun ilk harfini alabiliriz
         */
        char ilkHarf = scan.next().toLowerCase(Locale.ROOT).charAt(0);
        System.out.println("ismin ilk harfi:  " + ilkHarf);


    }
}
