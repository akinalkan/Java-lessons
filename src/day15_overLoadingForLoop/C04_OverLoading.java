package day15_overLoadingForLoop;

public class C04_OverLoading {

    public static void main(String[] args) {
        topla(5, 7);//Iki integer'in toplami: 12
        topla(5.2,3);
        topla(3,4.5);

    }
    /*
    Java hangi method'un calisacagina karar verirken optimizasyon yapar
    Eger hic cast yapmadan kullanabilecegi bir method varsa onu kullanir
    Eger cast yapmadan kullanacagi method yoksa en az cast yaparak kullanabilecegi method'u tercih eder

     */

    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki integer'in toplami: " + (sayi1 + sayi2));
    }

        public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double ve bir integer'in toplami: " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("Iki double'in toplami: " + (sayi1 + sayi2));
    }
}
