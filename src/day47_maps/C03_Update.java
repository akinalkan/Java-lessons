package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
         /*
         map.contains(key) <==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
         map.contains(value) <==> bir butun olarak value'nun map'de olup olmadigini doner

         ONEMLI NOT:    map.contains(value)  value'nun icindeki bir parcayi bulmada ise yaramaz
                        eger value icindeki bir parcayi aratmak istiyorsak map uzerinde manplations
                        yapmamiz lazim

             map.get(key) <==> verilen key'e ait degeri dondurur
          */

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();
       // System.out.println("sinifListMap.get(101) = " + sinifListMap.get(101));
        System.out.println(sinifListMap);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Devops, 105=Enes, Can, Tester, 106=Taha, Deniz, Tester, 107=Derya, Cem, Tester}
        System.out.println(sinifListMap.containsKey(104));//true
        System.out.println(sinifListMap.containsKey(124));//false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));//true
        System.out.println(sinifListMap.containsValue("JDev"));//false

        // Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'ler de replace tum value'yu degistirmek istersek kullanilabilir
        //kismi degisikliklerde kullanamayiz

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        //Map'i guncelleme yapmak icin key,yenideger'i map'e eklemeliyiz
        //Ornegin key 101 icin value Ali, Can, JDev
        //guncelleme icin sinifListMap.put(101, Ali, Can, JavaDeveloper)

        //Bunu yapabilmek icin her bir key'e ve ona ait value'ya ihtiyacim var

        Set<Integer> keySeti=sinifListMap.keySet();
        System.out.println("keySeti = " + keySeti);//keySeti = [101, 102, 103, 104, 105, 106, 107]
        String eachValue;
        System.out.println(sinifListMap);//1. durum
        for (Integer each:keySeti) {
            eachValue=sinifListMap.get(each);
            System.out.println(eachValue);/*Ali, Can, JDev
                                            Enes, Cem, Tester
                                            Taha, Emre, JDev
                                            Derya, Deniz, Devops
                                            Enes, Can, Tester
                                            Taha, Deniz, Tester
                                            Derya, Cem, Tester
                                            */
            eachValue=eachValue.replace("JDev","JavaDeveloper");
            sinifListMap.put(each,eachValue);
            /*
            Biz key'lerin tamamini aldik
            herbir key'in value'sunu getirdik
            value uzerinde degisikligi yapip
            yeni halini .put(key,yeniDeger) ile map'e atadik
             */
        }
        System.out.println(sinifListMap);//2.durum



    }
}
