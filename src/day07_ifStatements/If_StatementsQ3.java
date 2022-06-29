package day07_ifStatements;

import java.util.Scanner;

public class If_StatementsQ3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String gun = scan.next().toUpperCase();
        if ("PAZARTESİ".equals(gun) || "SALI".equals(gun) || "ÇARŞAMBA".equals(gun) || "PERŞEMBE".equals(gun) || "CUMA".equals(gun)) {
            System.out.println("Hafta içi");
        }
        if (gun.equals("PAZAR") || gun.equals("CUMARTESİ")) {
            System.out.println("Hafta sonu");
        }
        if (!(gun.equals("PAZARTESİ") || gun.equals("SALI") || gun.equals("ÇARŞAMBA")
                || gun.equals("PERŞEMBE") || gun.equals("CUMA") || gun.equals("PAZAR") || gun.equals("CUMARTESİ"))) {
            System.out.println("Lütfen geçerli bir gün ismi giriniz");
        }


    }
}
