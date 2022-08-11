package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer,String> sinifList=new HashMap<>();

        sinifList.put(101,"Ali, Can, JDev");//virgul  ve bosluk dikkat -->ayni olmali
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, Java");
        sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, Java, 104=Derya, Deniz, Tester}
        System.out.println(sinifList.keySet());//[101, 102, 103, 104]
        System.out.println(sinifList.values());//[Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, Java, Derya, Deniz, Tester]
        System.out.println("sinifList.size() = " + sinifList.size());//4
        System.out.println("sinifList.values().size() = " + sinifList.values().size());//sinifList.values().size() = 4
        /*
        Tum ogrencilerin bilgilerini alt alta yazdirin
         */
        Collection<String> tumValueColl=sinifList.values();
        System.out.println("tumValueColl = " + tumValueColl);//[Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, Java, Derya, Deniz, Tester]
        int sira=1;
        String[]  dizi;
        for (String each:tumValueColl) {
            /*
            Buradaki each bize herbir ogrenciye ait ayni yapidaki isim,
             soyisim, brans bilgilerini iceren String'ler getiriyor
             */
             dizi=each.split(", ");

            System.out.println(sira+"-"+dizi[0]+" "+dizi[1]);//----------------------->>>>>     //1-Ali Can
                                                                                                //2-Enes Cem
                                                                                                 //3-Taha Emre
                                                                                                //4-Derya Deniz
            sira++;
        }
        //Map'de bulunan ogrencilerinin isim ve soy isimlerini
        // birlestirerek bir sinif listesi olusturun.

        List<String> sinifIsimSoyisimList=new ArrayList<>();

        for (String each:tumValueColl) {

            dizi=each.split(", ");
            sinifIsimSoyisimList.add(dizi[0]+" "+dizi[1]);
        }
        System.out.println("Isim Soyisim Listesi = " + sinifIsimSoyisimList);//Isim Soyisim Listesi = [Ali Can, Enes Cem, Taha Emre, Derya Deniz]
    }
}
