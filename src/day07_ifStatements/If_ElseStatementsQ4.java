package day07_ifStatements;

import java.util.Scanner;

public class If_ElseStatementsQ4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üçgenin 1. kenarını giriniz");
        double kenar1=scan.nextDouble();

        System.out.println("Üçgenin 2. kenarını giriniz");
        double kenar2=scan.nextDouble();

        System.out.println("Üçgenin 3. kenarını giriniz");
        double kenar3=scan.nextDouble();
        if(kenar1==kenar2 && kenar1==kenar3){
            System.out.println("Eşkenar üçgen");
        }
        else {
            System.out.println("Eşkenar üçgen değil");
        }


    }
}
