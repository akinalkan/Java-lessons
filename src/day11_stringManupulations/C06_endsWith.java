package day11_stringManupulations;

import java.util.Scanner;

public class C06_endsWith {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

         /*
        Soru 1) Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
         @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        String input="fatih@gmaile.com";
        if(!input.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");


        }else if(input.endsWith("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontol edin");
        }



    }
}
