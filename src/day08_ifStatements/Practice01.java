package day08_ifStatements;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yıl giriniz");
        int yil= scan.nextInt();
        /*if(yil%4!=0){
            System.out.println("Artık yıl değil");
        }else if(yil%100!=0){
            System.out.println("Artık yıl");
        }else if(yil%400!=0){
            System.out.println("Artık yıl değil");
        }else{
            System.out.println("Artık yıl");
        }*/
        System.out.println(yil%4==0 ?yil%100==0 ? yil%400==0 ?"Artık yıl":"Artık yıl değil": "Artık yıl ":"Artık yıl değil");



    }
}
