package day06_concatenation;

import java.util.Locale;
import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
        Wrapper class javanin hazır method ları kullanabilmemiz için
        primitive data türlerinin her biri için açtığı class lardır

        int --->Integer
        char --->Character
        diğerleri primitive ile aynı sadece baş harfi büyük yazılır.

         */
        String str ="Java ile hayat ne güzel";
        System.out.println(str.toUpperCase());// JAVA İLE HAYAT NE GÜZEL

        boolean guzelMi=true;
        //guzelMi. boolean primitive olduğundan hazır methodu bulunmuyor
        Boolean buGuzelMi=true;
        buGuzelMi.toString();
        System.out.println("buGuzelMi = " + buGuzelMi);


        System.out.println(Short.MAX_VALUE); //32767

        System.out.println(Short.MAX_VALUE); //-32768

        String ogrNo="123456";

        // kullanıcıdan bir şifre isteyin
        //eğer şifre sadece rakamlardan oluşuyor ise kabul etmeyelim

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir şifre giriniz");

        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("Girilen şifrenin 3 fazlası : "+(sifre+3));
        System.out.println("Integer şifrenin 3 fazlası: "+(sifreSayi+3));
        /*
        Wrapper class lar ilerde kullanabileceğimiz pek çok faydalı hazır method içerir.

         */






    }
}
