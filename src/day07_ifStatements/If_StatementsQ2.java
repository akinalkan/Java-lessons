package day07_ifStatements;

import java.util.Scanner;

public class If_StatementsQ2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String ilkHarf;

        System.out.println("Gün isminin ilk harfini giriniz");
        ilkHarf=scan.next().toUpperCase();
        if(ilkHarf.equals("P")){
            System.out.println("Pazar,Pazartesi,Perşembe");
        }
        if(ilkHarf.equals("S")){
            System.out.println("Salı");
        }
        if(ilkHarf.equals("Ç")){
            System.out.println("Çarşamba");
        }
        if(ilkHarf.equals("C")){
            System.out.println("Cuma,Cumartesi");
        }


    }
}
