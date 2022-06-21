package day07_ifStatements;

import java.util.Scanner;

public class If_ElseStatementsQ1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.kenarı giriniz");
        double kenar1 = scan.nextDouble();
        System.out.println("2.kenarı giriniz");
        double kenar2 = scan.nextDouble();
        if(kenar1==kenar2){
            System.out.println("Kare");
        }
        else {
            System.out.println("Kare değil");
        }

    }
}
