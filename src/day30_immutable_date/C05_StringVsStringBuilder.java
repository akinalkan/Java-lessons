package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {

        /*
        String'mi yoksa StringBuilder'mi daha hizlidir.
        Bunun icin bir String olusturup 1000 kez sonuna nokta ekleyelim
        Oncesinde ve sonrasinda zamani alip aradaki farki bulalim

        Ayni islemi String Builder icin de yapalim
         */

        LocalTime baslangic=LocalTime.now();

        String str="Ahhhh Java";
        for (int i = 0; i <10000 ; i++) {
            str+=".";

        }

        LocalTime bitis=LocalTime.now();
        System.out.println("baslangic = " + baslangic);
        System.out.println("bitis = " + bitis);
        System.out.println(bitis.getNano()-baslangic.getNano());

        LocalTime baslangic1=LocalTime.now();

        StringBuilder sb=new StringBuilder("Ahhhh Java");//StringBuilder yontemi ile sb olusturuldu
        for (int i = 0; i <10000 ; i++) {
            sb.append(".");

        }
        LocalTime bitis1=LocalTime.now();
        System.out.println("baslangic1 = " + baslangic1);
        System.out.println("bitis1 = " + bitis1);
        System.out.println(bitis1.getNano()-baslangic1.getNano());

        System.out.println("String ,StringBuilder'in "+(int)(bitis.getNano()-baslangic.getNano())/(bitis1.getNano()-baslangic1.getNano())+" kati kadar zaman alir");





    }
}
