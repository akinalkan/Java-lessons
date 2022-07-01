package day14_MethodCreation;

import java.util.Scanner;

public class C15_Q3_A3 {
    public static void main(String[] args) {
          /*
          Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
          @ isareti icermiyorsa gecersiz email yazdirin
          @gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
          @gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz"
          */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen e-mail adresini giriniz.");
        String eMail = scan.next();
        eMailKontrol(eMail);


    }

    public static void eMailKontrol(String eMail) {
        if (!eMail.contains("@")) System.out.println("Gecersiz e-mail");
        else {
            if (!eMail.contains("@gmail.com")) System.out.println("Lutfen Gmail adresinizi girin");
            else {
                if (!eMail.endsWith("@gmail.com")) System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
                else System.out.println("E-mail basariyla tanimlandi.");
            }
        }


    }
}
