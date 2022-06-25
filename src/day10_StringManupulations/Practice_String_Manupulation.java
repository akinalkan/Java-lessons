package day10_StringManupulations;


import java.util.Scanner;

public class Practice_String_Manupulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



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
        /*
        System.out.print("Lütfen bir cümle giriniz: ");
        String cumle = scan.nextLine();
        System.out.print("Lutfen bir kelime giriniz :");
        String kelime = scan.next();

        int ilkkelime = cumle.indexOf(kelime);
        int tekrar = cumle.indexOf(kelime, ilkkelime + 1);

        if (ilkkelime == -1) {
            System.out.println("Girilen kelime cumlede kullanilmamis");

        } else if (tekrar == -1) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        } else {
            System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis");
        }

         */
        //String cumle="Java cok kolay, Java cok guzel";
        //        String kelime="Java";
        //        /*verilen kelime için asağıdaki şartlardan uygun olanı
        //        yazan bir programı yazınız
        //
        //        -verilen kelime cumlede kullanılmamış
        //        -verilen kelime cumle de  sadece 1 kere kullanılmış
        //        -verilen kelime   cumle de 1'den fazla  kullanılmış
        //
        //        */
        //        int kelimeIlkIndex=cumle.indexOf(kelime);
        //        int kelimeSonIndex=cumle.lastIndexOf(kelime);
        //        if(kelimeIlkIndex==-1){
        //            System.out.println("verilen kelime cumlede kullanılmamış");
        //        } else if (kelimeIlkIndex==kelimeSonIndex) {
        //            System.out.println("verilen kelime cumle de  sadece 1 kere kullanılmış");
        //
        //        }else {
        //            System.out.println("verilen kelime   cumle de 1'den fazla  kullanılmış");
        //        }

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

        /*String str="Çalışırsanız, Java öğrenmek çok kolay";
        System.out.println(str.endsWith("y"));//true
        System.out.println(str.endsWith("t"));//false
        System.out.println(str.endsWith("olay"));//true -->kelime de aratılabilir

         */
        /*String str="Çalışırsanız, Java öğrenmek çok kolay";
        System.out.println(str.startsWith("Ç"));//true
        System.out.println(str.startsWith("Çalış"));//true
        System.out.println(str.startsWith("ş",4));//true
        System.out.println(str.startsWith("Java",14));//true

         */
        /*String str="Çalışırsanız, Java öğrenmek çok kolay";
        System.out.println(str.isEmpty());//false

        String str2="";
        System.out.println(str2.isEmpty());//true

         */
        /*String str="Java öğrenmek çok kolay";
        System.out.println(str.replace("a","x"));
        System.out.println(str.replace("Java","x"));
        System.out.println(str.replace("a","xxx"));
        System.out.println(str.replace("a",""));
        System.out.println(str.replace('a','x'));

         */
        /*String str="Java'da rakamlar 1234567890";
        System.out.println(str.replaceAll("a","*"));
        System.out.println(str.replaceAll("\\s","*"));
        System.out.println(str.replaceAll("\\S","*"));
        System.out.println(str.replaceAll("\\w","*"));
        System.out.println(str.replaceAll("\\W","*"));
        System.out.println(str.replaceAll("\\d","*"));
        System.out.println(str.replaceAll("\\D","*"));

         */
        /*String str="Java'da rakamlar 1234567890";
        System.out.println(str.replaceFirst("a","*"));
        System.out.println(str.replaceFirst("lar","*"));
        System.out.println(str.replaceFirst("\\s","*"));
        System.out.println(str.replaceFirst("\\D","*"));

         */
        /*String str="Java OOP konsepti kullanır";
        System.out.println(str.substring(0));//Java OOP konsepti kullanır
        System.out.println(str.substring(10));//onsepti kullanır
        System.out.println(str.substring(26));//
        System.out.println(str.substring(29));//.StringIndexOutOfBoundsException hatası verir

         */
        /*String str="Java OOP konsepti kullanır";
        System.out.println(str.substring(5,11));//OOP ko
        System.out.println(str.substring(3,4));//a
        System.out.println(str.substring(8,8));//
        System.out.println(str.substring(8,2));//.StringIndexOutOfBoundsException hatası verir

         */
        /*String str="  Java öğrenmek çok güzel.   ";
        System.out.println(str);               //  Java öğrenmek çok güzel.
        System.out.println(str.length());       //29
        System.out.println(str.trim());         //Java öğrenmek çok güzel.
        System.out.println(str.trim().length());//24

         */
        //Soru-1
        /*String str=" Java ogrenmek123 Cok guzel@ ";//Java ogrenmek cok guzel
        System.out.println(str.replace("C","c")
                .replaceAll("\\d","")
                .replaceAll("@","").trim());//Java ogrenmek cok guzel

         */
        //Soru-2
        /*String str1="$13.99";
        String str2="$10.55";
        double str3=Double.parseDouble(str1.replace("$",""));
        double str4=Double.parseDouble(str2.replace("$",""));
        System.out.println(str3+str4);

         */
        //Soru-3
        /*System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();
        if(isim.indexOf("a")!=-1){
            System.out.println("Girdiğiniz isim a harfini içeriyor");

        }
        if(isim.indexOf("Z")!=-1){
            System.out.println("Girdiğiniz isim Z harfini içeriyor");
        }
        if(isim.indexOf("a")==-1 && isim.indexOf("Z")==-1){
            System.out.println("Girdiğiniz isim a ve Z harfini içermiyor");
        }

         */
        //Soru-4
        /*System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisim giriniz");
        String soyisim=scan.nextLine();
        if(isim.length()>soyisim.length()){
            System.out.println(isim);
        }else {
            System.out.println(soyisim);
        }

         */
        //Soru-5
        /*System.out.println("Lütfen 4 harfli bir kelime yazınız");
        String metin=scan.nextLine();
        String ters="";
        for(int i=metin.length()-1;i>=0;i--){
            ters=ters+metin.charAt(i);

        }
        System.out.println("Girdiğiniz Metnin tersi:\n"+ters);

         */
        /* soru-5 ikinci çözüm
        String input="kaya";
        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);
        System.out.println(tersInput);
         */

























    }

}



