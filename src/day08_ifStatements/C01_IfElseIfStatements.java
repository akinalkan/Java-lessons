package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan gun ismini yazmasini isteyin.
        // Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin,
        // gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun= scan.nextLine().toLowerCase();
        if ("pazartesi".equals(gun)) {
            System.out.println("Paz");
        } else if ("sali".equals(gun)) {
            System.out.println("Sal");
        } else if ("carsamba".equals(gun)) {
            System.out.println("Car");
        } else if ("persembe".equals(gun)) {
            System.out.println("Per");
        } else if ("cuma".equals(gun)) {
            System.out.println("Cum");
        } else if ("cumartesi".equals(gun)) {
            System.out.println("Cum");
        } else if ("pazar".equals(gun)) {
            System.out.println("Paz");
        } else {
            System.out.println("Gecerli gun ismi giriniz");
        }
    }
}
