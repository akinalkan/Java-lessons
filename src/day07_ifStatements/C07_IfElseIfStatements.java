package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        bir önceki soruda kullanıcı negatif değer girerse uyaralım
        Not: birden fazla if else if birbirine bağlanmışsa son durum önemlidir
        eğer else ile bitiyorsa bütün ihitmaller kapsanıyor demektir
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();
        if(yas<0){
            System.out.println("Lütfen geçerli bir yaş giriniz");
        }else if(yas<65){
            System.out.println("Emekli olamazsın" + " " + (65 - yas) + " yıl" + " çalışmalısın");

        }else{
            System.out.println("Emekli olabilirsiniz");

        }
    }
}
