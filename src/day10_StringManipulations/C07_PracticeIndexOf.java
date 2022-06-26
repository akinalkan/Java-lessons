package day10_StringManipulations;

import java.util.Scanner;

public class C07_PracticeIndexOf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle=scan.nextLine();
        System.out.print("Lutfen bir kelime giriniz :");
        String kelime=scan.next();//örnek kelime:so so so us su us su su

        int ilkkelime=cumle.indexOf(kelime);
        int tekrar=cumle.indexOf(kelime,ilkkelime+1);

        if(ilkkelime==-1){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if(tekrar==-1){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");

        }else{
            System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis");

        }




    }
}
