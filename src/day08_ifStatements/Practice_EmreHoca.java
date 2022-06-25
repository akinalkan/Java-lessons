package day08_ifStatements;

import java.util.Scanner;

public class Practice_EmreHoca {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz" + "\n kadın için K erkek için E harfini giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();
        if(cinsiyet=='E'){
            if(yas<0 || yas>80){
                System.out.println("Gecerli yas giriniz");

            }else if(yas<65){
                System.out.println("Emekli olamazsin"+(65-yas)+" yıl daha çalışmalısınız");

            }else{
                System.out.println("Emekli olabilirsin");

            }



        }else if(cinsiyet=='K'){
            if (yas<0 || yas>80){
                System.out.println("Gecerli yas giriniz"+(60-yas)+" yıl daha çalışmalısınız");
            }else if (yas<60){
                System.out.println("Emekli olamazsin");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        }else{
            System.out.println("Lutfen gecerli bir tercih yaziniz");

        }







    }
}
