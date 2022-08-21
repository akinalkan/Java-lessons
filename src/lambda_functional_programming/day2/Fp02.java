package lambda_functional_programming.day2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1-)     t->"Logic" , (t,u)-> "Logic"
         Bu yapiya "Lambda Expession" denir

    2-)Functional Programming kapsaminda  "Lambda Expession" kullanilabilir ama onerilmez
     "Lambda Expession" yerine "Method Reference" tercih edilir.

    3-)  "Method Reference" kullanimi "Class Name :: Method Name"
    Ayni zamanda kendi class'larinizi da kullanabilirsiniz.

    Ornegin: Bir Animal class'iniz var ve bu class'da "eat()" method'una sahip==>"Animal :: eat"

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
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKarelerToplamiYazdir1(liste);
        tekrarsizCiftElemanlarinKarelerToplamiYazdir2(liste);
        tekrarsizCiftElemanlarinKarelerToplamiYazdir3(liste);
        tekrarsizCiftElemanlarinKuplerininCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukCiftMin(liste);
        besdenBuyukYariDeger(liste);
        getMinEleman(liste);

    }

    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(Utils::print_);//Utils::print_  ==>public static void print_(Object str){
        //System.out.print(str+" ");
        // method'unu kullaniriz
    }
    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(Utils::ciftElemanlari).forEach(Utils::print_);
    }
    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().filter(Utils::tekElamanlari).map(Utils::kareAl).forEach(Utils::print_);
    }

    //4) Tek  elemanların küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(Utils::tekElamanlari).map(Utils::kupAl).forEach(Utils::print_);

    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    //1.Yol
    public static void tekrarsizCiftElemanlarinKarelerToplamiYazdir1(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlari).map(Utils::kareAl).reduce(0, Math::addExact);
        //Math::addExact==>toplama yapar
        //2. yol==> Integer toplam= list.stream().distinct().filter(Utils::ciftElemanlari).map(Utils::kareAl).reduce(Math::addExact).get();
        System.out.println("toplam-1 = " + toplam);
    }

    //2.Yol
    public static void tekrarsizCiftElemanlarinKarelerToplamiYazdir2(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlari).map(Utils::kareAl).reduce(Math::addExact).get();


        System.out.println("toplam-2= " + toplam);
    }

    //3.Yol
    public static void tekrarsizCiftElemanlarinKarelerToplamiYazdir3(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlari).map(Utils::kareAl).reduce(0, Integer::sum);
        //Integer::sum==>toplama yapar
        System.out.println("toplam-3= " + toplam);
    }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKuplerininCarpimi(List<Integer> list) {
        int carpim = list.stream().distinct().filter(Utils::ciftElemanlari).map(Utils::kupAl).reduce(Math::multiplyExact).get();
        System.out.println("carpim = " + carpim);
        //Math::multiplyExact ==> elemanlarin carpimini yapar
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman(List<Integer> list) {
        int max = list.stream().distinct().reduce(Math::max).get();
        System.out.println("max = " + max);
        //Math::max ==> en buyuk elemani verir
    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    public static void getMinEleman(List<Integer> list) {
        int min = list.stream().distinct().reduce(Math::min).get();
        System.out.println("max = " + min);
    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void yedidenBuyukCiftMin(List<Integer> list) {
        int sayi = list.stream().distinct().filter(t -> t > 7).filter(Utils::ciftElemanlari).reduce(Math::min).get();
        System.out.println("sayi = " + sayi);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void besdenBuyukYariDeger(List<Integer> list) {
        List<Double> listYaz=list.
                stream().                                    //Gerekli methodları kullanmamızı sağlar
                        distinct().                          //Tekarlı olanları almaz
                        filter(t-> t>5).                     //Koşula göre filtreleme yapar
                        map(Utils::yarisiniAl).              //Her bir elemanın değerini değiştirmeye yarar
                        sorted(Comparator.reverseOrder()).   //Sıralama yapar
                        collect(Collectors.toList());        //Elamanları collection'a çevirir.
        System.out.println("listYaz = " + listYaz);
    }


}
