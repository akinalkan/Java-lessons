package lambda_functional_programming.day2;

import java.util.ArrayList;
import java.util.List;

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

    }
    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer>list){
        list.stream().forEach(Utils::print_);//Utils::print_  ==>public static void print_(Object str){
                                                        //System.out.print(str+" ");
                                                        // method'unu kullaniriz
    }
    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer>list){
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
}
