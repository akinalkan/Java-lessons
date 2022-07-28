package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*
        tek katli array'lerde array'i direk yazdiramiyoruz
        cunku array non-primitive data turudur ve
        her non-primitive data turu direk yazdiramayabiliriz


        ancak array'in icerisindeki elementleri direk yazdirabiliyorduk
        cunku genelde primitive data turu yada string elementler kullaniliyordu

        Multi dimensional arraylerde en cok dikkat edecegimiz konu
        ulasmak istedigimiz elementin bir array mi yoksa
        primitive data mi oldugudur
         */
        int[][] sayilar = {{1, 2, 4, 5}, {3, 4}};
        int[] [] rakam={{0,1,2,3,4},{0,1,2}};
        /*
        burada sayilar arrayini dusunursek icinde 2 tane array var
        sayilar[0] ==> [1,2,4,5]

        ancak en icerdeki elementlere ulasirsak direk yazdirabiliriz
         */

        System.out.println(sayilar[0]);//[I@1b28cdfa
        int[]  sayi12={1,2,3};
        System.out.println(sayi12);

        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]
        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3
        System.out.println(Arrays.toString(sayilar));//[[I@1b28cdfa, [I@eed1f14]
        System.out.println(Arrays.deepToString(rakam));
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 4, 5], [3, 4]]

        /*
        array'i 2 sekilde declare edebiliyorduk
        1.'sinde elemanlari direk yazabiliriz
        int [][] sayilar={{1,2,4,5},{3,4}};

        2.sinde outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz

        int[][] sayilar=new int[3][4];

        ancak 2. yontemle yaptigimiz da inner arraylarin farkli uzunlukta olma ihtimali
        kalmaz bu ornek icin outer array'in 3 tane inner array'i vardir
        her bir inner array'in ise 4 er elemani vardir

             Eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
            mecburen 1.yontemi kullanmalisiniz
         */


    }
}
