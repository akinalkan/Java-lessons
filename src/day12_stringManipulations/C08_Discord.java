package day12_stringManipulations;

import java.util.Scanner;

public class C08_Discord {
    public static void main(String[] args) {
        //Soru-1
        String str = " Java ogrenmek123 Cok guzel@ ";//Java ogrenmek cok guzel
        System.out.println(str.replace("C", "c")
                .replaceAll("\\d", "")
                .replaceAll("@", "")
                .trim());//Java ogrenmek cok guzel
        //Soru-2
        /*String str1="$13.99";
        String str2="$10.55";
        double str3=Double.parseDouble(str1.replace("$",""));//13.99
        double str4=Double.parseDouble(str2.replace("$",""));//10.55
        System.out.println(str3+str4);
        /*String str5="123";
        int str6=Integer.parseInt(str5);
        System.out.println(str6+3);
        */



        // Soru-3
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();
        if(isim.contains("a")){
            System.out.println("Girdiğiniz isim a harfini içeriyor");

        }
        if(isim.indexOf("Z")!=-1){
            System.out.println("Girdiğiniz isim Z harfini içeriyor");
        }
        if(isim.indexOf("a")==-1 && isim.contains("Z")){
            System.out.println("Girdiğiniz isim a ve Z harfini içermiyor");//isim.indexOf("a")==-1 ve isim.contains("a")
                                                                            // aynı iş yapar
        }
        /*if (!(isim.contains("a")||isim.contains("Z"))){
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }  else if (isim.contains("a") &&!(isim.contains("Z"))) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        } else if (isim.contains("Z")&&!(isim.contains("a"))) {
            System.out.println("isim Z harfi iceriyor");
        }      else{
            System.out.println("Girdiginiz isim a ve Z harfi iceriyor");
        }     */



    }
}
