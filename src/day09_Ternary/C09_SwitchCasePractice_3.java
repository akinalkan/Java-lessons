package day09_Ternary;

import java.util.Scanner;

public class C09_SwitchCasePractice_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen SDET kısaltmasındaki harflerden birini giriniz");
        char harf=scan.next().toUpperCase().charAt(0);

        switch (harf){

            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In testing");
                break;
            default:
                System.out.println("Lütfen geçerli bir giriş yapınız");
        }




    }
}
