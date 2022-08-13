package day48_maps_TheEnd;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap=ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);


        sinifListMap.clear();
        System.out.println("clear'dan sonra map : "+sinifListMap);//clear'dan sonra map : {}
        sinifListMap=ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(104,"Aradiginiz key yok"));//Derya, Deniz, Devops
        System.out.println(sinifListMap.getOrDefault(110,"Aradiginiz key yok"));//Aradiginiz key yok

        sinifListMap.putIfAbsent(104,"Derya, Okyanus, Developer");
        sinifListMap.putIfAbsent(108,"Akin, Alkan, Offer");//varsa degistirmez yoksa koyar
        ReusableMethods.entryYazdir(sinifListMap);
        /*
        sinifListMap'e key olarak 106 yoksa , "Mevlut,Han, Tester" ekleyin
        106 daha once varsa eski degeri degistirmek istediginizden emin misiniz? yazdirin

        106'nin oldugunu kontrol etmek icin
        contains key daha mantikli ama biz yeni ogrendigimiz method ile
        yapalim

        map.putIfabsent(key,value)==> key varsa ekleme yapmaz bize o key ile kayitli olan value gelir
                                  ==> key yoksa yeni degerleri ekler ve null dondurur
         */
        System.out.println(sinifListMap.putIfAbsent(106, "Mevlut,Han, Tester"));//Taha, Deniz, Tester

        if(sinifListMap.putIfAbsent(109,"Mevlut,Han, Tester")==null){
            System.out.println("Kayit basarili");
        }else{
            System.out.println("eski degeri degistirmek istediginizden emin misiniz ?");
        }
        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.remove(106);//106'yi silip bize sildigini dondurur
        sinifListMap.remove(107,"Derya, Cem, Tester");//silerse true silmezse false dondurur
        ReusableMethods.entryYazdir(sinifListMap);

        System.out.println(sinifListMap.replace(109, "Erdal, Ciftci, Tester"));//Mevlut,Han, Tester
        sinifListMap.put(110,"Zeynep, Ayca, QA");
        ReusableMethods.entryYazdir(sinifListMap);
        System.out.println("sinifListMap.size() = " + sinifListMap.size());//8


    }
}
