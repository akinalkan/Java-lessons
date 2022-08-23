package day21_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class C02_EnUzunveKisaKelime {
    /*
    Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun
     */
    public static void main(String[] args) {
        String [] isimler={"Erdal","Onur","Mehmet","Hayrullah","Mihrican"};

        enUzunVeKisayiYazdir(isimler);
        enUzunKelime(isimler);

    }

    public static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzunKelime=isimler[0];
        String EnKisaKelime=isimler[0];

        for (int i = 1; i < isimler.length ; i++) {
            if(isimler[i].length()>enUzunKelime.length()){
                enUzunKelime=isimler[i];

            }
            if(isimler[i].length()<EnKisaKelime.length()){
                EnKisaKelime=isimler[i];

            }

        }
        System.out.println("EnKisaKelime = " + EnKisaKelime);
        System.out.println("enUzunKelime = " + enUzunKelime);




    }
    //2.Yol Lambda  [method reference]
    public static void enUzunKelime(String[] arr){
        String str= Arrays.stream(arr).max(Comparator.comparing(String::length)).get();
        System.out.println("En uzun kelime : "+str);
    }
}
