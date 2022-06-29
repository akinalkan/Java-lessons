package day05_matematikselIslemler;

import java.util.Locale;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str="Java Cok Guzel";
        str.toUpperCase();

        int sayi=10;
        //primitive data türlerinin yanın da method 'lar
        // olmaz java bazı method 'ları kullanabilmemiz için
        // her bir primitive için wrapper class oluşturmuştur

        Integer sayi2=10;

        sayi2.byteValue();
        System.out.println("sayi2 = " + sayi2);
        String str2="1234";
        int sayi3=Integer.parseInt(str2);
        System.out.println("sayi3 = " + sayi3);

    }
}
