package day28_staticBlock;

public class C01_StaticBlock {
    static int sayi;
    static {
        /*
        static block class uyelerinin tamamindan once calisir
        (Main methoddan bile once)

        static block class olusturuldugunda calisir
        genelikle de class'la ilgili on ayarlamalar veya
        static variable'lara deger atamak icin kullanilir

        static block'larin class icerisinde nerede oldugu onemli degildir
        Onece static bloklar calisir

        birden fazla static block varsa yukaridan asagi dogru calisir

         */
        System.out.println("static block calisti");//
        sayi=10;
    }


    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println(sayi);//0
    }
    static {
        System.out.println("2. static block'da calisti");// 2. static blok ta mainden once calisir
    }
}
