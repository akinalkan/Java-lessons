package day14_MethodCreation;

import java.util.Scanner;

public class C09_Q3 {
    public static void main(String[] args) {
        /*
        Email kontrolu yapan bir program yazin.Kullanici girdigi sifre
        -@ isareti icermiyorsa gecersiz email yazdirin
        -@gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
        -@gmail.com ile bitmiyorsa "Yazimda bir sorun var,maili kontrol ediniz"
         */
       String mail=mailKontrol();

    }

    public static String mailKontrol() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen mail adresinizi yaziniz: ");
        String mail=scan.nextLine();
        if(mail.indexOf('@')==-1){
            System.out.println("gecersiz email");

        } else if (!mail.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresinizi girin");

        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("Yazimda bir sorun var,maili kontrol ediniz");


        }else{
            System.out.println("Email adresiniz kaydedildi");
        }
        return mail;


    }
}
