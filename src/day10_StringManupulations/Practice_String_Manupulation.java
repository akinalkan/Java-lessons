package day10_StringManupulations;


import java.util.Scanner;

public class Practice_String_Manupulation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);



        /*String isim="Ali";
        String soyisim="Can";
        System.out.println(isim+" "+soyisim);

         */
       /* 1 String isim="Ali";
        String soyisim="Can";
        System.out.println(isim.concat(soyisim));

        */
        /*String isim="Techproeducation";
        System.out.println(isim.charAt(3)); // h

         */
        /*String isim="Techproeducation";
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());

         */
        /*String isim="TECHPROEDUCATION";
        System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr"))); //techproeducatıon

         */
        /*String isim1="Ali Can";
        String isim2="Ali Can";
        System.out.println(isim1.equals(isim2));// true

         */
        /*String isim1="Ali Can";
        String isim2=isim1+"";
        System.out.println(isim1==isim2);// false
        System.out.println(isim1.equals(isim2));// true

         */
        /*String isim1="Ali Can";
        String isim2="ali can";
        //System.out.println(isim1.equalsIgnoreCase(isim2));
        boolean sonuc=isim1.equalsIgnoreCase(isim2);
        if(sonuc==true){
            System.out.println("eşit iki String");

        }else{
            System.out.println("Farklı iki String");
        }

         */
        /*String isim="Ali Can";
        System.out.println(isim.length());// 7
        String isim2="";
        System.out.println(isim2.length());// 0

         */
        /*String str="Calisirsaniz, Java ogrenmek cok kolay";
        System.out.println(str.indexOf('a'));// 1
        System.out.println(str.indexOf("a"));// 1
        System.out.println(str.indexOf("t"));// -1 --> olmayan birşey sorgulanırsa cvp:-1
        System.out.println(str.indexOf("Java"));// 14
        System.out.println(str.indexOf('a',11));// 15 --> 11. index ten sonra sorguda 'a' 15.sırada

         */
       /* System.out.println("Lütfen bir cümle yazınız");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("Lütfen bir harf giriniz");
        char harf=scan.next().toLowerCase().charAt(0);
        if(cumle.indexOf(harf)>=0){
            System.out.println("Girilen karakter  cümlede var");
        }else {
            System.out.println("Girilen karakter  cümlede yok");
        }

        */
        /*String str = "Calisirsaniz, Java ogrenmek cok kolay";
        System.out.println("index sayısı: " + str.length());// 37
        System.out.println("a'nın son index'i: " + str.lastIndexOf('a'));// 35
        System.out.println("a'nın son index'i: " +str.lastIndexOf("a"));// 35
        System.out.println("olmayan karakter sorgulanırsa: " +str.lastIndexOf("t"));// -1
        System.out.println("Java'nın son index'i: " +str.lastIndexOf("Java"));// 14
        System.out.println("a'nın 11.index ten öncesi: " +str.lastIndexOf('a',11));// 8

         */
        /*System.out.println("Lütfen bir cümle yazınız");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("Lütfen bir harf giriniz");
        char harf=scan.next().toLowerCase().charAt(0);
        if(cumle.lastIndexOf(harf)>=0){
            System.out.println("Girilen karakter  cümlede var");
        }else {
            System.out.println("Girilen karakter  cümlede yok");
        }

         */
        /*String str = "Calisirsaniz, Java ogrenmek cok kolay";
        System.out.println(str.contains("a"));//true
        System.out.println(str.contains("t"));// false
        System.out.println(str.contains("Java"));//true

         */

        /*System.out.println("Lütfen mail adresinizi giriniz");
        String mail=scan.nextLine();
         if(mail.contains("@gmail.com")==true){
             System.out.println("Email adresiniz kaydedildi");
         }else{
             System.out.println("Lütfen yazımı kontrol edin");
         }

         */
        /*System.out.println("Lütfen bir cümle yazınız");
        String cumle=scan.nextLine().toLowerCase();
        if(cumle.contains("buyuk")==true){
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains("kucuk")==true){
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("Cümle kucuk yada buyuk kelimesi içermiyor");
        }

         */






    }

}



