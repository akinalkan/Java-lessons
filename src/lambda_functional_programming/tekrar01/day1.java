package lambda_functional_programming.tekrar01;

public class day1 {
    /*
    1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
    2) Functional Programming'de "Ne Yapılacak" (What to do) üzerine yoğunlaşılır.
       Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğunlaşılır.
    3) Functional Programming, Arrays ve Collections ile kullanılır.
    4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.
     */

    // methoddaki isim ne demek --> (List<Integer> list) bunu Integer bir list le çalış demek. bi list yok

    // list yazan liste ismi ile farklı. list olan dinamik ne verirsen ver ismine mahmut'da olur.

    // stream() methodu collection'dan elementleri dahil etmek için ve methodlara ulaşmak için kullanilir.

    //filter(t ->t%2==0)===>if(t%2==0) ile ayni islem

    //.map(t->t*t)==>t'leri t*t 'ler le degistirir.[map burada donustur demektir.]

    // listedeki değerler değişecekse map methodu kullanılır.

    //distinct()==> tekrarsiz olan elemanlari alir

    //reduce(0,(t,u)->t+u)==>t=0 baslangic degerini alir ona u'lari ekler

    //Comparator.reverseOrder()==>tersten siralama yapar[String'de olmaz ama StringBuilder'da kullanilir]

    //findFirst().get()==> bu ikisi birlikte kullanilir ve ilk elemani verir.


    public static void main(String[] args) {

    }
    //1) Lambda ile, Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    //2) Lambda ile, Çift olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    //3) Lambda ile, Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    //4) Lambda ile, Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    //5) Lambda ile, Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

}
