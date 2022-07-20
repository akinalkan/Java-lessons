package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {
        //Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int[] arr={2,3,5,6,3,5,4,1,9,6,3,5,5};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]
        System.out.println();

        List<Integer> tekrarEdenler=new ArrayList<>();
        List<Integer> sonListe=new ArrayList<>();


        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1] && !tekrarEdenler.contains(arr[i])){//array'i listeye cevirme
                 sonListe.add(arr[i]);
                tekrarEdenler.add(arr[i] );
            }

        }
        System.out.println("sonListe olarak  : "+sonListe);

        Integer[] arr2= sonListe.toArray(new Integer[0]);//listeyi array'e cevirme
        sonListe.add(11);//-------------->listeye ekleme yapabiliriz-->+11
        System.out.println("sonListe ekli = " + sonListe);//sonListe ekli = [3, 5, 6, 11]

        System.out.println("Array olarak : "+Arrays.toString(arr2));//Array olarak : [3, 5, 6]








    }
}
