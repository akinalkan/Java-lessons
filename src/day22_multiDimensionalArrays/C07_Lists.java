package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList <> ();
        /*
        List primitive data turlerini kabul etmez.int yerine Integer kullanacagiz
         */
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(3);
        System.out.println(sayilar);//[5, 7, 3]
        //sadece add kullanirsak Java sona ekler

        sayilar.add(2,10);// index'i 2 olan yere 10 elementini ekleyelim
        System.out.println(sayilar);//[5, 7, 10, 3]
        //add(index,element) istedigimiz index'e istedigimiz elementi yerlestirir
        //add method'u eski elementleri silmez veya update etmez'yeni element ekler

    }
}
