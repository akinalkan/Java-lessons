package day20_Arrays;

import java.util.Arrays;

public class C03_leght {
    public static void main(String[] args) {

        //iki sekilde Array olusturabiliriz

        int sayilar[]={1,2,3};//Type-1

        String harfler[]=new String[4];//Type-2

        System.out.println("sayilar array'in uzunlugu : "+sayilar.length);//3
        //String lengt() method'unda parantez var 'array'de yok
        System.out.println(harfler.length);//4
        System.out.println(Arrays.toString(harfler));//[null, null, null, null]

        /*
        harfler array'inin son elemntini yazdiralim
         */
        System.out.println((harfler)[harfler.length-1]);//harfler array'inin son elementi yazdirildi-->null
        System.out.println(harfler[5]);//ArrayIndexOutOfBoundsException





    }
}
