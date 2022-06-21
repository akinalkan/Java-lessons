package day07_ifStatements;

import java.util.Scanner;

public class If_StatementsQ1 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi=scan.nextInt();

        if(sayi%2==0){
            System.out.println("Girilen sayı çifttir");

        }
        if(sayi%2!=0){
            System.out.println("Girilen sayı tektir");
        }

    }
}
