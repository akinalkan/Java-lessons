package day14_MethodCreation;

import java.util.Scanner;

public class C11_Q1_A2 {
    public static void main(String[] args) {
         /*
          Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
          kucuk mu oldugunu, ayrica ve 100'den buyukse birler, onlar ve yuzler basamagindaki
          rakamlarin toplamini, 100'den kucukse sadece birler basamagini yazdiran 3 method
          olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        sayiTekCift(sayi);
        negatifPozitif(sayi);
        sayiKontrol(sayi);

    }

    public static void sayiTekCift(int sayi) {
        if (sayi % 2 == 0) System.out.println("Sayi cifttir.");
        else System.out.println("Sayi tektir.");
    }
    public static void negatifPozitif(int sayi) {
        System.out.println(sayi<0 ? "Sayi negatif." : sayi==0 ? "Sayi notrdur" : "Sayi pozitif.");
    }
    public static void sayiKontrol(int sayi) {
        if (sayi<100){
            System.out.println("Birler basamagi :" + sayi%10);
        }else {
            int rakamlarToplami = sayi%10;
            sayi/=10;
            rakamlarToplami+=sayi%10;
            sayi/=10;
            rakamlarToplami+= sayi;
            System.out.println("Rakamlar toplami :" +rakamlarToplami);
        }

    }

}
