package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C01_NestedMaps {
    public static void main(String[] args) {
        /*
        Eger bir elementle ilgili tutacagimiz bilgiler coksa veya kompleks ise
        bu defa ic ice map kullanmayi tercih ederiz

        ic ice map kullandigimiz da daha fazla datayi daha duzenli olarak tutma imkanimiz olur
        Ancak bilgiye ulasmak ve manipule etmek zorlasacaktir.

        Ornek olarak dunku map'imizi map'lerden olusan bir map olarak olusturalim
        [Once en icten baslanir]
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Devops");
         */

        Map<String,String> ogr101=new HashMap<>();
        ogr101.put("isim","Enes");
        ogr101.put("soyIsim","Cem");
        ogr101.put("brans","Tester");

        Map<String,String> ogr102=new HashMap<>();
        ogr102.put("isim","Taha");
        ogr102.put("soyIsim","Emre");
        ogr102.put("brans","JDev");

        Map<String,String> ogr103=new HashMap<>();
        ogr103.put("isim","Derya");
        ogr103.put("soyIsim","Deniz");
        ogr103.put("brans","Devops");

        Map<Integer,Map<String,String>> ogrencinestedMap=new HashMap<>();
        ogrencinestedMap.put(101,ogr101);
        ogrencinestedMap.put(102,ogr102);
        ogrencinestedMap.put(103,ogr103);

        System.out.println(ogrencinestedMap);
        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySeti = ogrencinestedMap.entrySet();

        for (Map.Entry each:ogrenciEntrySeti) {
            System.out.println(each);

        }
        //102 nolu kisinin ismini yazdiralim
        System.out.println(ogrencinestedMap.get(102).get("isim"));//Taha

        String isim=ogrencinestedMap.get(102).get("isim");




    }
}
