package day38_exceptions;

import java.util.Scanner;

public class C04_Exceptions {
    public static void main(String[] args) {
        String[] urunler={"Nutella","Cokokrem","Sut","Findik"};
        Scanner scan=new Scanner(System.in);
        System.out.print("Istediginiz urunun sira no'sunu giriniz : ");


        int istenenSira=0;
        while (true){
            try {
                istenenSira= scan.nextInt();
            } catch (Exception e) {
                System.out.println("girilen index degeri hatali");
            }

            if(istenenSira> urunler.length && istenenSira<=0){
                System.out.println("lutfen listeden bir urun seciniz");
            }else{
                try {
                    System.out.println("istene urun : "+urunler[istenenSira-1]);
                    break;
                } catch (Exception e) {
                    System.out.println("girilen index degeri hatali");

                }
            }
        }
    }
}
