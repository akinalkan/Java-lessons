package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {


        /*
        List ile calisirken en kotu ozelligi
        elemanlari tek tek eklemek
         */

        Integer []arr={2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};
        /*
        bu kadar cok elemanli bir listeyi tek tek eleman olarak
        girmek yerine array olusturup for loop ile olusturdugumuz
        list'e tasiyabiliriz
         */
        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);//[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        bu islemi yapmasi icin java'nin olusturdugu bir method'da var ancak ancak
        bu yontemin cok yan etkisi var

        1- bu sekilde olusturulan listeyde ,addremove givi size 'i degistiren method'lar kullanilamaz

        2-asList method'u ile olusturulan liste ve kaynak olan array
        birbiri ile ilisik olarak hayatlarina devam ederler
        birinde yaptigimiz  degisiklik digerinide otomatik olarak digerini de isler

         */
        List<Integer> sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2);//[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);
        System.out.println(sayilar);

       // sayilar2.add(5);
        //System.out.println(sayilar2);//UnsupportedOperationException

        arr[0]=20;
        System.out.println("arr: "+Arrays.toString(arr));
        System.out.println("sayilar :"+sayilar);
        System.out.println("array'de degisiklik yapinca sayilar2 :"+sayilar2);




    }
}
