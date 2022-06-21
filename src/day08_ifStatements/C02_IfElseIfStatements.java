package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 0'dan 100'e kadar bir not değeri giriniz ");
        double  note= scan.nextDouble();
        if(note<0 || note>100){
            System.out.println("Lütfen geçerli bir not giriniz");
        } else if (note<50){
            System.out.println("not:D");
        } else if (note>=50 && note<60){
            System.out.println("not:C");
        }
        else if(note>=60 && note<80){
            System.out.println("not:B");
        }
        else {
            System.out.println("not:A");
        }
    }

    }

