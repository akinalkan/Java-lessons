package day24_arrayList_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {


        String[] arr={"Ismail","Nurullah","Fatih"};
        /*
        Uzun listeler olusturmamiz gerektiginde tek tek eklemek yerine
        array olusturup bunlari list'e cevirmek daha pratik olabilir

        1-loop ile array'deki tum elemanlari list'e ceviririz
        2-Arraus.asList() kullanabiliriz
        Ancak 2 yanetkivar
        -Arrays class'i kullanildigi icin array ozelliklewri geceerli olur
        dolayisiyla List'de olan add,remove gibi size i degistiren
        meethodlar bu sekilde olusturulan list'lerde kullanilamaz

        -Kaynak olan array ile urun olan list ozdesl;estiri;lir
        birinde olan degisiklik digerinde oomatik olarak islenir
         */

        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList);//[Ismail, Nurullah, Fatih]

        List<Integer> sayilar=Arrays.asList(new Integer[5]);
        System.out.println(sayilar);//[null, null, null, null, null]


        //1. yan etki
        //sinifList.add("Erdi");-->hata
        //sinifList.remove(1);-->hata


        //2. yan etki

        arr[1]="Emre";
        System.out.println("Degisim sonrasi array : "+Arrays.toString(arr));//Degisim sonrasi array : [Ismail, Emre, Fatih]
        System.out.println("Array'i degisstirince list : "+sinifList);//Array'i degisstirince list : [Ismail, Emre, Fatih]
        sinifList.set(0,"Nurullah");
        System.out.println("List'i degistirince list : "+sinifList);//List'i degistirince list : [Nurullah, Emre, Fatih]
        System.out.println("List'i degistirince array : "+Arrays.toString(arr));//List'i degistirince array : [Nurullah, Emre, Fatih]







    }
}
