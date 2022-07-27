package day20_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Arrays {



    public static void main(String[] args) {



        int sayilar[]=new int[3];

        int sayiciklar[]=new int[5];
        sayiciklar[0]=1;
        sayiciklar[1]=11;
        sayiciklar[2]=111;
        sayiciklar[3]=1111;
        sayiciklar[4]=11111;


        System.out.println(Arrays.toString(sayiciklar));//[1, 11, 111, 1111, 11111]
        System.out.println(sayilar);//[I@1b28cdfa
        /*
        non-primitive data turundeki data'lari her zaman direkt yazdiramayiz
        Array'i yazdirmak istersek java'daki Arrays class'indan yardim isteriz ve toString methed'unu kullaniriz.
         */
        System.out.println(Arrays.toString(sayilar));//{0,0,0}

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(Arrays.toString(sayilar));//{5,3,10}

        String[] sinifList ={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList));//[Ali, Ayse, Ahmet]
        Arrays.sort(sinifList);
        System.out.println(Arrays.toString(sinifList));//[Ahmet, Ali, Ayse]
        sinifList[1]="Hasan";
        System.out.println(Arrays.toString(sinifList));//[Ahmet, Hasan, Ayse]
        System.out.println(sinifList[1]);//Hasan
        System.out.println(sinifList[0]);//Ahmet


    }

}

