package lambda_functional_programming.day3;

import lambda_functional_programming.day2.Utils;

import java.util.ArrayList;
import java.util.Comparator;
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
        System.out.println();
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        naturalSiralama(liste);
        System.out.println();
        tekrarsizSonKaraktereGoreSiralama(liste);
        System.out.println();
        tekrarsizSonKaraktereGoreSiralama2(liste);
        System.out.println();
        uzunlukveIlkHarfeGoreSiralaYazdir(liste);
        System.out.println();
        // bestenBuyukleriSil(liste);
        //baslangiciAYadaSonuNOlaniSil(liste);
      //  baslangiciAYadaSonuNOlaniSil2(liste);
        uzunlugu8Ile10ArasiVeOIleBiteniSil(liste);
        System.out.println();
        System.out.println("Tum elemanlar uzunlugu 12 den az mi? "+uzunlugu12denAzMi(liste));
        System.out.println("x ile baslayan var mi? = " + xIleBaslayanVarMi(liste));
        System.out.println("r ile biten var mi? = " + rIleBitiyorMu(liste));

    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    public static void buyukHarfleYazdir(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::print_);
    }/*
    //2.yol
    public static void buyukHarfleYazdir2(List<String> list) {
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
    */

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreYazdir(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::print_);
        //Comparator.comparing(...):==>...siralama kosulunu belirtmek icin kullanilir.
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreTersYazdir(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utils::print_);
    }

    public static void naturalSiralama(List<String> list) {
        list.stream().sorted().forEach(Utils::print_);
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void tekrarsizSonKaraktereGoreSiralama(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::print_);
    }

    public static void tekrarsizSonKaraktereGoreSiralama2(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakter2)).forEach(Utils::print_);
    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlukveIlkHarfeGoreSiralaYazdir(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakterAl)).//thenComparing() :==>siralama icin bir kosul daha belirtir
                forEach(Utils::print_);
    }

    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
//    public static void bestenBuyukleriSil(List<String> list){
//        list.removeIf(t->t.length()>5);
//        System.out.println(list);
//
//    }
    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
    //1.Yol
 //   public static void baslangiciAYadaSonuNOlaniSil(List<String> list) {
 //       list.removeIf(t -> t.charAt(0) == 'A' || t.charAt(0) == 'a' || t.charAt(t.length() - 1) == 'N' || t.charAt(t.length() - 1) == 'n');
 //       System.out.println(list);
 //   }
    //2.Yol
 //  public static void baslangiciAYadaSonuNOlaniSil2(List<String> list) {
 //      list.removeIf(t -> t.startsWith("a")||t.startsWith("A")||t.endsWith("n")||t.endsWith("N"));
 //      System.out.println(list);
 //  }

//8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.
    public static void uzunlugu8Ile10ArasiVeOIleBiteniSil(List<String>list){
        list.removeIf(t->(t.length()>7 && t.length()<11 )||t.endsWith("o"));
        System.out.println(list);
    }
    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
    public static boolean uzunlugu12denAzMi (List<String> list){
        return list.stream().allMatch(t->t.length()<12);//allMatch==>tum elemanlar istenen kosula uyar mi?
    }
    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean xIleBaslayanVarMi (List<String>list){
        return list.stream().noneMatch(t->!t.startsWith("X"));
    }
    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rIleBitiyorMu (List<String>list){
        return list.stream().anyMatch(t->t.endsWith("r"));
    }
}