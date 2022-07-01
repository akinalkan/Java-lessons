package day15_overLoadingForLoop;

public class C03_OverLoading {
    public static void main(String[] args) {
        topla(5, 7);//Iki integer'in toplami: 12
        topla(5.2,3);

    }

    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki integer'in toplami: " + (sayi1 + sayi2));
    }

    /*
    Bir class'da parametre sayisi ve parametre turleri ayni olan iki methodu OLUSTURAMAYIZ.
    public static void topla(int sayi1,int sayi2){
        System.out.println("Iki integer'in toplami: "+(sayi1+sayi2));


    }

     */
    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double ve bir integer'in toplami: " + (sayi1 + sayi2));
    }
    public static void topla(int sayi1, double sayi2) {
        System.out.println("bir integer'in ve bir double'in toplami: " + (sayi1 + sayi2));
    }
    public static void topla(double sayi1, double sayi2) {
        System.out.println("Iki double'in toplami: " + (sayi1 + sayi2));
    }
}