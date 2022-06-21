package day04_dataCasting;

public class C12_Work7 {
    public static void main(String[] args) {

        byte sayi1 = 10;
        short sayi2 = 20;
        int sayi3 = 30;
        long sayi4 = 40;
        float sayi5 = 50.45f;
        double sayi6 = 60.456;
        System.out.println("byte&short: " + (sayi1 + sayi2));
        System.out.println("short&int: " + (sayi2 + sayi3));
        System.out.println("int&long: " + (sayi3 + sayi4));
        System.out.println("byte&float: " + (sayi1 + sayi5));
        System.out.println("short&double: " + (sayi2 + sayi6));


    }
}
