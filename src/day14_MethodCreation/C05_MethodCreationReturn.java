package day14_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        eger bir class'in icerisinde herhangi bir hesaplama yapip
        bunu da kalici olarak istersek kodumuzu sade ve anlasi;lir tutmak icin
        ;islemi bir method'a yapip sonucu main method'a dondurebiliriz
        Return Type'i void olmayan bir method'un sonucunu main method da bir
        variable'a atama yaparsak programin geri kalaninda
          bu yeni degeri kullanma sansimiz olur


         */
        //kullanicidan sehir ismini ve dugum tarihini alip
        //bunlari programda kullanacagimiz formatta bize donduren bir format olusturun
        //sehir ismini programimizda buyuk harf olarak
        //tarihi ise 2022-06-30 seklinde kullanmak istiyoruz
        String sehir=sehirAl();
        String tarih=tarihAl();
        System.out.println("Girdiginiz sehir: "+sehir);
        System.out.println("Girdiginiz tarih: "+tarih);



    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz");
        int yil=scan.nextInt();
        if(yil>1900 && yil<2100){
            tarih=yil+"-";

        }else{
            System.out.println("Yil icin gecer;li bir sayi yazmalisiniz(1900-2100)");
        }
        System.out.println("Kacinci ay oldugunu tam sayi olarak yaziniz(1-12)");
        int ay=scan.nextInt();
        if (ay<=0  || ay>12){
            System.out.println("Ay no 1-12 arasinda olamlidir");
        }else if(ay<10){
            tarih=tarih+"0"+ay+"-";

        }else{
            tarih=tarih+ay+"-";

        }
        System.out.println("ayin kacinci gunu  oldugunu tam sayi olarak yaziniz(1-31)");
        int gun=scan.nextInt();
        if(gun<=0 || gun>31){
            System.out.println("gun  no olarak1-31 arasinda sayi olarak yaziniz");
        }else if(gun<10){
            tarih=tarih+"0"+gun;

        }else {
            tarih=tarih+gun;

        }
        return tarih;

    }

    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sehir adi giriniz");
        String sehirAdi=scan.next().toUpperCase();
        return sehirAdi;

    }
}
