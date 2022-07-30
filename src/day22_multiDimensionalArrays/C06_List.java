package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C06_List {
    public static void main(String[] args) {

        /*
        array'i array yapan sembol [] idi
        arrayList'de ise <> diamond (elmas) kullaniriz
         */
        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);//[]

        //bir list'e eleman eklemek istersek
        isimler.add("Basak");
        isimler.add("Ayse");


        /*
        String'de bir method calistirdigimizda
         assign yapmazsak String degismiyordu

         String isim="Suleyman"
         isim.toUpperCase();//SULEYMAN
         sout(isim)==>Suleyman
         */
        System.out.println(isimler);//[Basak, Ayse]

        /*
        List'in tek kotu tarafi array alt yapisini kullandigi
         icin elemanlari birer birer eklemek zorunda olmamizdir
         */
        int[] sayilar={1,2,3,41,4546,78,9,6,4,6,1,1321,1,41654};
        List<Integer> liste=new ArrayList<>();

        for (int each:sayilar) {
            liste.add(each);

        }
        System.out.println("liste = " + liste);

        Integer[] arrnew=liste.toArray(new Integer[0]);
        System.out.println("arrNew array : "+Arrays.toString(arrnew));

        String[] isimler2={"ali","Veli","Ayse"};
        List<String> isimlerListesi=new ArrayList<>();


        for (String each:isimler2) {
            isimlerListesi.add(each);

        }
        System.out.println("isimlerListesi = " + isimlerListesi);

        String[] isimlerarrayi=isimlerListesi.toArray(new String[0]);
        System.out.println("isimler arrayi : "+Arrays.toString(isimlerarrayi));



    }
}
