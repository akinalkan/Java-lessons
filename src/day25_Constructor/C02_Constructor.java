package day25_Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {


        C01            obj1      =    new         C01()        ;
   //   class adi     objenin adi    keyword    constructor

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        List<String> list=new ArrayList<>();
       // list<String> list2=new List(); list interface oldugu icin obje olusturamayiz

        /*
        Java'da bir obje olusturabilmek icin mutlaka constructor kullanmalisiniz
         */


        System.out.println(obj1.sayi);//0
        obj1.deneme();// C01'den deneme method calisir



    }
}
