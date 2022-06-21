package day03_scanner;

public class C03_swap2 {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;

        System.out.println("swaptan önce  " + "sayi1: " + sayi1 + "\tsayi2: " + sayi2);
                                 //10  20
        sayi1 = sayi1 + sayi2;   //30  20
        sayi2 = sayi1 - sayi2;   //30  10
        sayi1 = sayi1 - sayi2;   //20  10
        System.out.println("swaptan sonra " + "sayi1: " + sayi1 + "\tsayi2: " + sayi2);
    }
}
