package day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {
        /*
         Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa
          tum cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi
           kucuk harf olarak yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk
           yada buyuk kelimesi icermiyor” yazdirin.
         */
        String cumle = "Java buyuk, dunya kucuk";
        cumle = cumle.toLowerCase();

        //requirements'de buyuk harf , kucuk harf hassasiyeti
        // hakkında bir sey söylenmemiş
        //ikinci olarak da her iki kelimeyi içerme durumu açıklanmamış
        //bu durumda görevi bize kim verdiyse ona sormak lazım
        //ek requirements :ikisi de içeriyorsa "karar ver buyuk mü yazdırayımi küçük mü?"
        //case sensitive olmasın
        if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
            System.out.println("Karar ver. Buyuk mu, kucuk mu yazdirayim?");

        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());

        } else {
            System.out.println("Cumle kucuk ya da buyuk kelimesi icermiyor.");
        }

    }
}
