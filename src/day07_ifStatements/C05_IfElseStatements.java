package day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz");//ascıı tablosu kullanılıyor
        char harf = scan.next().charAt(0);
        if ((harf >= 'a' && harf <= 'z') || (harf >= 'A' && harf <= 'Z')) {
            System.out.println("Girilen karakter bir harf: " + harf);

        }else {
            System.out.println("Girilen karakter bir harf değildir ");
        }


    }
}
