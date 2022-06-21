package day08_ifStatements;

import java.util.Scanner;

public class S7_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 0'dan 100'e kadar bir not değeri giriniz ");
        int note= scan.nextInt();
        if(note<50){
            System.out.println("not:D");
        }
        if(note>=50 && note<60){
            System.out.println("not:C");
        }
        if(note>=60 && note<80){
            System.out.println("not:B");
        }
        if(note>80 && note<=100){
            System.out.println("not:A");
        }

        
        
    }
}
