package day18_while_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
         1-islemi bitirmek icin 0’a basmasini soyleyin.
         2-Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
         3- “Negatif sayi giremezsiniz” yazdirip basa donun
         4-Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
         5-yanlislikla kac negative sayi girdigini ve
         6-girdigi pozitif sayilarin  toplaminin kac oldugunu yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozSayiAdedi=0;;
        int negSayiAdedi=0;
        int pozSayilarTop=0;

        do{
            System.out.print("Lutfen toplamak uzere pozitif tamsayi giriniz : ");
            sayi=scan.nextInt();

            if(sayi>0){
                pozSayilarTop+=sayi;
                pozSayiAdedi++;

            }else if(sayi<0){
                System.out.println("Negatif sayi giremezsiniz");
                negSayiAdedi++;

            }


        }while(sayi!=0);
        System.out.println(pozSayiAdedi+" adet pozitif sayi girdiniz, toplamlari : "+pozSayilarTop);
        System.out.println(negSayiAdedi+" adet negatif sayi girdiniz ancak onlar toplama dahil edilmedi");


    }
}
