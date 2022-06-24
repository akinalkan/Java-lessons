package day11_stringManupulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";
        /*verilen kelime için asağıdaki şartlardan uygun olanı
        yazan bir programı yazınız

        -verilen kelime cumlede kullanılmamış
        -verilen kelime cumle de  sadece 1 kere kullanılmış
        -verilen kelime   cumle de 1'den fazla  kullanılmış

        */
        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);
        if(kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanılmamış");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cumle de  sadece 1 kere kullanılmış");

        }else {
            System.out.println("verilen kelime   cumle de 1'den fazla  kullanılmış");
        }


    }
}
