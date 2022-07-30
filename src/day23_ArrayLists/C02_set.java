package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
        elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
         istedigimiz yeni urunle degistirip
         eski urunu ,var olan eski urunler listesine ekleyelim
         */

        List<String> urunler=new ArrayList<>();//[]
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        System.out.println("ilk urunler listesi : "+urunler);//ilk urunler listesi : [Nutella, Ikram, Cekirdek, Cay]


        List<String> eskiurunler=new ArrayList<>();
        /*
        listedeki ikram'in yerine biskrem koyalim
        ikram'i da eski urunler listesine ekleyelim
         */
        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";


        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp,yeniUrun);

        eskiurunler.add(silinenUrun);
        System.out.println("urunler listesi : "+urunler);//urunler listesi : [Nutella, Biskrem, Cekirdek, Cay]
        System.out.println("eski urunler listesi : "+eskiurunler);
        System.out.println();

         yeniUrun="Kahve";
         silinecekUrun="Cay";


         temp=urunler.indexOf(silinecekUrun);
         silinenUrun=urunler.set(temp,yeniUrun);

        eskiurunler.add(silinenUrun);
        System.out.println("urunler listesi : "+urunler);
        System.out.println("eski urunler listesi : "+eskiurunler);
        System.out.println();

        yeniUrun="Findik";
        silinecekUrun="Cekirdek";


        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiurunler.add(silinenUrun);
        System.out.println("urunler listesi : "+urunler);
        System.out.println("eski urunler listesi : "+eskiurunler);






    }
}
