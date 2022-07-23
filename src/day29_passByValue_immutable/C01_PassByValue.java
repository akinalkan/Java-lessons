package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4 elemanli bir array olusturalim
        sonra ayri bir method'da bu array'in 2. ve 4. elemanlarini
        100'den kucuk rastgele bir sayi ile
        degitirelim ve yeni halini yazdiralim.
         */

        int []arr={5,7,8,10};
        System.out.println("ilk array : "+Arrays.toString(arr));//ilk array : [5, 7, 8, 10]

        //int sayi=10;
       // System.out.println("ilk sayi degeri : "+sayi);
        //sayiDegisim(sayi);
        //System.out.println("method sonrasi : "+sayi);

        elemanDegistir(arr);//method'un icinde : [5, 97, 8, 87]
        System.out.println("main method'un icerisinde \ndiger method calistiktan sonra array : "+Arrays.toString(arr));//[5, 97, 8, 87]
    }
/*
    public static void sayiDegisim(int sayi) {
        sayi+=5;
        System.out.println("method da sayi : "+sayi);
    }

 */

    public static void elemanDegistir(int[] arr) {

        Random rnd=new Random();
        arr[1]= rnd.nextInt(100);
        arr[3]= rnd.nextInt(100);
        System.out.println("method'un icinde : "+Arrays.toString(arr));
        System.out.println();
;    }
}
