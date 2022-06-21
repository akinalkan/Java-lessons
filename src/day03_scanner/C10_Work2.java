package day03_scanner;

import java.util.Scanner;

public class C10_Work2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen karenin kenar uzunluğunu yazınız");
        double kenar=scan.nextDouble();
        System.out.println("Karenin alanı:\t"+(kenar*kenar));


    }
}
