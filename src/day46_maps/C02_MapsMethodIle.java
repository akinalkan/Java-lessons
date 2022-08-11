package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = ReusableMethods.mapOlustur();
        System.out.println("***"+ogrenciMap);
        //***{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, Java, 104=Derya, Deniz, Tester}

        /*
        Value'lari sira numarali olarak yazdirin
         */
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

        //isim ve soy isimlerin birlikte olacagi bir liste olusturun

        List<String> sinifIsimSoyisim=ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);

        System.out.println("sinif Isim Soyisim listesi = " + sinifIsimSoyisim);
        //sinif Isim Soyisim listesi = [Ali Can, Enes Cem, Taha Emre, Derya Deniz]
    }
}
