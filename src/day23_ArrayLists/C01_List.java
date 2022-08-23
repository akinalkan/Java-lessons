package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu : "+sayilar1.size());//Listenin boyutu : 3
        sayilar1.add(2);//[5,3,2,2]
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1);//[5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("Listenin yeni boyutu : "+sayilar1.size());//Listenin yeni boyutu : 8
        sayilar1.set(2,8);
        System.out.println(sayilar1);//[5, 3, 8, 2, 5, 3, 2, 2]
        System.out.println(sayilar1.set(0,12));//5-->silinen eleman
        System.out.println(sayilar1);//[12, 3, 8, 2, 5, 3, 2, 2]-->listenin yeni hali
        /*
        set method'u istenen index'teki eski elementi silip,
         yerine verdigimiz yeni elementi set eder

         eger eski elementi silmek istemiyorsak'
         add(index,deger) method'u kullanabiliriz

         set() sildigi eski elementi bize dondurur
         */
        Integer[] arr=sayilar1.toArray(new Integer[0]);//sayilar1 list'i arr arrayine cevirildi
        System.out.println("arr arrayi yazdirildi : "+Arrays.toString(arr));
    }

}
