package day12_stringManupulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        // str'ı Bugun Java cok guzel haline getirin
        /*
        replaceAll methodundaki All'un amacı aynı karakterdeki tum karakterleri kapsamasıdır
        1-butun sayıları sil
        2-butun özel karakterleri sil
         */
        str=str.replaceAll("\\s","asdf");// boşlukşları bir stringe dönüştür
        str=str.replaceAll("\\W","")   // word olmayanlardan kurtulduk
                .replaceAll("\\d","")   //sayılardan kurtulduk
                .replaceAll("asdf"," "); // boşlukları geri koyduk
        System.out.println(str);






    }
}
