package day08_ifStatements;

import java.util.Scanner;

public class S6_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz");
        double sayi1=scan.nextDouble();

        System.out.println("Lütfen 2. sayıyı giriniz");
        double sayi2=scan.nextDouble();
        if(sayi1>0 && sayi2>0){
            System.out.println("Girilen sayılar toplamı: "+(sayi1+sayi2));
        }
        if(sayi1<0 && sayi2<0){
            System.out.println("Girilen sayılar çarpımı :"+(sayi1*sayi2));
        }
        if((sayi1<0 &&sayi2>0) || (sayi1>0 && sayi2<0)){
            System.out.println("Farklı işaretlerde sayılarla işlem yapamazsınız");
        }
        if(sayi1==0 ||sayi2==0){
            System.out.println("sıfır çarpmaya göre yutan elemandır");
        }






    }
}
