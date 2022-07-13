package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    /*
    Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
     */
    public static void main(String[] args) {

        String [] sinifListesi={"Ali Can","Nida Yucedal","Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";


        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
      String [] yeniSinifListesi=new String[sinifListesi.length+1];//[null,null]
        //eski listeden 1 eleman fazla yeni bir array olusturduk
        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i]=sinifListesi[i];
        }
        //oncelikle eski listenin tum elemanlarini yeni listeye tasidim
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
        //son index'e ise eklenecek ismi atadim



      return yeniSinifListesi;
    }
}
