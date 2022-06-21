package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();
        if (yas < 65 && yas>0) {
            System.out.println("Emekli olamazsın" + " " + (65 - yas) + " yıl" + " çalışmalısın");

        }
        else if(yas>=65){
            System.out.println("Emekli olabilirsiniz");
        }
        else {
            System.out.println("Hatalı giriş yaptınız.");
        }

    }
}
