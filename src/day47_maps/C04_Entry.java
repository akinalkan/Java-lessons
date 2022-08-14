package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        /*
        Java Entry<K,V> map'in icerisinde bulunan her bir kaydi
        K=V seklinde tutar
        Dolayisiyla herhangi bir Entry'a ulastigimizda
        hem key'e hem de value'ya ulasabiliriz ve istedigimiz islemleri yapabiliriz

        entry.getKey()--> bize key'i getirir
         entry.getValue()--> bize value'i getirir
         entry.setValue()--> bize istedigimiz updateleri yapmamaizi saglar


         */

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);

        //map'in herbir elemani alt alta yazdirin

        Set<Map.Entry<Integer, String>> sinifEntrySet=sinifListMap.entrySet();
        System.out.println(sinifEntrySet);


        for (Map.Entry<Integer,String> each:sinifEntrySet) {
            System.out.println(each);

        }

        //Map'in tum elemanlarinda varsa Tester kurs ismini QA olarak degistirelim

        String eachValue;
        for (Map.Entry<Integer,String> each:sinifEntrySet) {

            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);

        }
        System.out.println("sinifListMap = " + sinifListMap);

    }
}
