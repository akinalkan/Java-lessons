package day46_maps;

import java.io.FilterOutputStream;
import java.util.*;

public class ReusableMethods {
    public static Map<Integer,String> mapOlustur(){
        Map<Integer,String> sinifMap=new HashMap<>();

        sinifMap.put(101,"Ali, Can, JDev");//virgul  ve bosluk dikkat -->ayni olmali
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(103,"Taha, Emre, JDev");
        sinifMap.put(104,"Derya, Deniz, Devops");
        sinifMap.put(105,"Enes, Can, Tester");
        sinifMap.put(106,"Taha, Deniz, Tester");
        sinifMap.put(107,"Derya, Cem, Tester");

        return sinifMap;
    }

    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira=1;
        for (String each: ogrenciMap.values()) {
            System.out.println(sira+" - "+each);
            sira++;

        }

    }


    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakiList=new ArrayList<>();
        String[] arr;

        for (String each: ogrenciMap.values()) {
            arr=each.split(", ");
            methoddakiList.add(arr[0]+" "+arr[1]);

        }
        return methoddakiList;
    }

    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) {

        //brans=bransdakiOgrenciSayisi

        Map<String,Integer> bransOgrSayiMap= new TreeMap<>();

        Collection<String> valuesCollection=sinifListMap.values();
        String[] valueArr;
        String brans;
        Integer bransdakiOgrenciSayisi;

        for (String each:valuesCollection) {
            valueArr=each.split(", ");
            brans=valueArr[2];

            //bransin bransOgrSayiMap'inde key olarak daha once
            //eklenip eklenmedigini kontrol etmeliyiz

            if(!bransOgrSayiMap.containsKey(brans)){
                bransOgrSayiMap.put(brans,1);
            }else {
                bransdakiOgrenciSayisi=bransOgrSayiMap.get(brans);
                bransOgrSayiMap.put(brans,++bransdakiOgrenciSayisi);
            }


        }System.out.println(bransOgrSayiMap);


    }

    public static void entryYazdir(Map<Integer, String> sinifListMap) {

        Set<Map.Entry<Integer,String>> sinifListEntrySeti=sinifListMap.entrySet();

        for (Map.Entry<Integer,String> entry:sinifListEntrySeti) {
            System.out.println(entry);

        }
    }
}
