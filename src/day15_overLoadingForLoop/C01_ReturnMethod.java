package day15_overLoadingForLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        /*
        Verilen iki sayiyi carpip sonucu bize donduren bir method olusturun
                 */
        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println("main icinde sonuc = " + sonuc);

    }

    public static int carpGetir(int sayi1, int sayi2) {
        int sonuc=sayi1*sayi2;
        System.out.println("main disinda sonuc = " + sonuc);

        return sonuc;

    }
}
