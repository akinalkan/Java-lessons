package day10_StringManipulations;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Beni psikopata bağlamayın";
        System.out.println(str.toLowerCase());//beni psikopata bağlamayın
        System.out.println(str.toUpperCase());//BENİ PSİKOPATA BAĞLAMAYIN
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));//BENİ PSİKOPATA BAĞLAMAYIN

        /*
        Eğer büyük küçük harf dönüşümünde local bir dili
        esas almak isterseniz bu method kullanılabilir
         */


    }
}
