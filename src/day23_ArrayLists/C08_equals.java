package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        System.out.println(urunler);

        List<String> urunler2=new ArrayList<>();
        urunler2.add("Ikram");
        urunler2.add("Nutella");
        urunler2.add("Cay");
        urunler2.add("Cekirdek");
        System.out.println(urunler2);
        System.out.println(urunler.equals(urunler2));//false
        System.out.println(urunler.get(0).equals(urunler2.get(1)));//true  Nutella<-->Nutella
        Collections.sort(urunler);
        Collections.sort(urunler2);

        System.out.println(urunler.equals(urunler2));//true





    }
}
