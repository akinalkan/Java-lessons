package day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        Soru 1) Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
         @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */
        System.out.println("Lütfen mail adresinizi giriniz");
        String email=scan.nextLine();
        if(!email.contains("@gmail.com")==true){
            System.out.println("lutfen gmail adresi giriniz");
        }else if(email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontol edin");
        }


    }
}
