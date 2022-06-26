package day12_stringManupulations;

import java.util.Scanner;

public class C06_subString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz");
        String sifre=scan.nextLine();
        String ilkHarf=sifre.substring(0,1);
        String ilkHarfBuyuk=sifre.substring(0,1).toUpperCase();

        String sonHarf=sifre.substring(sifre.length()-1);
        String sonHarfKucuk=sifre.substring(sifre.length()-1).toLowerCase();
        String boslukSifre=sifre.replaceAll("\\s","");
        if(ilkHarf.equals(ilkHarfBuyuk) && sonHarf.equals(sonHarfKucuk) &&sifre.equals(boslukSifre)&&sifre.length()>=8){
            System.out.println("Sifre basari ile tanimlandi");
        }else{
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }

    }
}
