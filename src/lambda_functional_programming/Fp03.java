package lambda_functional_programming;

import lambda_functional_programming.day2.Utils;

import java.util.ArrayList;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        buyukHarfleYazdir(liste);

    }
    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    public static void buyukHarfleYazdir(List<String> list){
       list.stream().map(String::toUpperCase).forEach(Utils::print_);
    }/*
    //2.yol
    public static void buyukHarfleYazdir2(List<String> list) {
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
    */
}
