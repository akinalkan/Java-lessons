package day07_ifStatements;

import java.util.Scanner;

public class If_StatementsQ5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String gun = scan.next().toLowerCase();

        if (gun.equals("cuma")) {
            System.out.println("Müslümanlar için kutsal gün");
        }
        if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler için kutsal gün");
        }
        if (gun.equals("pazar")) {
            System.out.println("Hıristiyanlar için kutsal gün");
        }

    }
}
