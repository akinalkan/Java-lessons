package day46_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReusableMethods {
    public static Map<Integer,String> mapOlustur(){
        Map<Integer,String> sinifMap=new HashMap<>();

        sinifMap.put(101,"Ali, Can, JDev");//virgul  ve bosluk dikkat -->ayni olmali
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(103,"Taha, Emre, Java");
        sinifMap.put(104,"Derya, Deniz, Tester");

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
}
