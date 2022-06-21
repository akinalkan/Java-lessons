package day06_concatenation;

import java.util.Scanner;

public class C03_Practice01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 5 basamaklı bir sayı giriniz");

        String sifre=scan.nextLine();

        Integer sifreYazi=Integer.parseInt(sifre);
        System.out.println("sifre: "+(sifre+3));
        System.out.println("şifreyazi: "+(sifreYazi+3));



    }
}
