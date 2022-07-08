package day19_Scope;

public class C02_StaticVariables {


    static int  statSayi=10;
    String isim="Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVar;
    /*
    class'daki variable'lara deger atamasakda Java(default olarak) kabul eder.
     */



    public static void main(String[] args) {
        /*
        bir variable static olusturulduysa
         objeler icin degil class icin gecerlidir

         */
        System.out.println(statSayi);//10
        staticMethod();//10
        statSayi=12;
        System.out.println(statSayi);//12

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(statSayi);//20
        /*
        instance bir variable'in degerini bulmak icin objenin olusturulmasindan
         itibaren istenen satira kadar kodu takip etmelyiz
        static variable'da ise class'in en basindan itibaren baslayarak istenen
         satira kadar kodu takip edip static degerin son degerini bulmamiz gerekir
         */





    }

    public static void staticMethod(){
        System.out.println(statSayi);//10

    }
    public void staticOlmayanMethod(){


        System.out.println(statSayi);//12
        statSayi=20;
        /*
        static variable'lar class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tum methodlar
         static variable'lari gorebilir ve degistirebilirler
         farkli methodlarda static variable'in hangi degeri alacagini bilmek
         istiyorsak class'in basindan itibaren
         code'un calismasini takip etmeliyiz
         method ne zaman cagirilirsa o anki
         static variable degerini method'da biliriz
         */

    }
}
