package lambda_functional_programming.day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
    1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
    2) Functional Programming'de "Ne Yapılacak" (What to do) üzerine yoğunlaşılır.
       Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğunlaşılır.
    3) Functional Programming, Arrays ve Collections ile kullanılır.
    4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.
     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        ciftElemanlarinKuplerCarpimi(liste);
        getMaxEleman01(liste);
        getMaxEleman02(liste);
        getYedidenBuyukCiftMin(liste);
        minValue(liste);
        System.out.println();
        getYedidenBuyukCiftMin2(liste);
        getYedidenBuyukCiftMin3(liste);
        getTersSiralamaTekrarsizElemanlarinYarisi(liste);
    }

    //1) Java ile, Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
            // methoddaki isim ne demek --> (List<Integer> list) bunu Integer bir list le çalış demek. bi list yok
            // list yazan liste ismi ile farklı. list olan dinamik ne verirsen ver ismine mhmut ta olur.
        }
    }

    //1) Lambda ile, Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
        // stream() methodu collection'dan elementleri dahil etmek için ve methodlara ulaşmak için kullnlr.
    }

    //2) Java ile, Çift olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //2) Lambda ile, Çift olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));//filter(t ->t%2==0)===>if(t%2==0) ile ayni islem
    }

    //3) Lambda ile, Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));//.map(t->t*t)==>t'leri t*t 'ler le degistirir
        // listedeki değerler değişecekse map methodu kullanılır.
    }

    //4) Lambda ile, Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));//distinct()==> tekrarsiz olan elemanlari alir
    }

    //5) Lambda ile, Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);//reduce(0,(t,u)->t+u)==>t=0
        // baslangic degerini alir ona u lari ekler
        //image (14).png
        System.out.print(toplam);
        // Toplama dediğimiz için 0 koyduk, Çarpma olsaydı 1 koyacaktık.
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void ciftElemanlarinKuplerCarpimi(List<Integer> list) {
        int carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    //1.Yol:
    public static void getMaxEleman01(List<Integer> list) {
        int max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);


    }

    // 2.Yol:
    public static void getMaxEleman02(List<Integer> list) {
        int max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println("max : " + max);
    }

//Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

    public static void minValue(List<Integer> list) {
        Integer min = list.stream().distinct().reduce(list.get(0), (t, u) -> t < u ? t : u);
        System.out.print("Ödev_min = " + min);
    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    //1.Yol:
    public static void getYedidenBuyukCiftMin(List<Integer> list) {
        int min = list.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("min = " + min);
    }

    //2.Yol:
    public static void getYedidenBuyukCiftMin2(List<Integer> list) {
        int min = list.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println("min = " + min);     //Comparator.reverseOrder()==>terstern siralam yapar[String'de olmaz ama StringBuilder'da kullanilir]
    }
    // 3.Yol:
    public static void getYedidenBuyukCiftMin3(List<Integer> list) {
        int min=list.
                stream().
                distinct().
                filter(t->t%2==0).
                filter(t -> t > 7).
                sorted().
                findFirst().get();//findFirst().get()==> bu ikisi birlikte
                                    // kullanilir ve ilk elemani verir.
        System.out.println("min = " + min);
    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public  static void getTersSiralamaTekrarsizElemanlarinYarisi(List<Integer>list){
        List<Double> list2= list.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).sorted(Comparator.reverseOrder()).toList();

        System.out.println("list2 = " + list2);
    }


}
