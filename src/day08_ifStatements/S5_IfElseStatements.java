package day08_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class S5_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen gün ismi yazınız");
        String gun= scan.next().toLowerCase();
        switch (gun) {
            case "pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar" ->
                    System.out.println("" + gun.toUpperCase(Locale.ROOT).charAt(0) + gun.toLowerCase().charAt(1) + gun.toLowerCase().charAt(2));
            default -> System.out.println("Lütfen geçerli bir gün yazınız");
        }




    }

}
