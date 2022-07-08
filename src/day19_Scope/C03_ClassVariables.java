package day19_Scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
       /*
       Farkli bir class'da calisirken
       herhangi bir class adini yazip noktaya basarsak
       static adini yazdigimiz class'daki tum static class uyelerini gorebilir
       ve kullanabiliriz
        */
        C02_StaticVariables.staticMethod();//10
        System.out.println(C02_StaticVariables.statSayi);//10
        System.out.println(C02_StaticVariables.degersizStaticVar);//0
        /*
        class level variable'lara deger atayip atamamak bize kalmistir
        istersek deger atamasi yapariz
        istemezsek deger atamayiz
        eger deger atamissak Java atadigimiz o degeri kabul eder
        deger atamazsak o zaman bu variable'lara default bir deger atamasi yapar
        int -->0
        String -->null
        boolean-->false
        char-->'' (hiclik)
         */


        /*
        baska class'daki instance variable'lara obje olusturarak ulasabiliriz
         */
        C01_InstanceVariables obje5= new C01_InstanceVariables();
        obje5.staticOlmayanMethod();//static olmayan method : 20


        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//10
        // bu method icinde staticSayi=20 oldu
        System.out.println(obje1.isim);//Mehmet
        System.out.println(obje1.degersizInstanceVar);//0
        System.out.println(C02_StaticVariables.statSayi);//20
        /*
        Farkli bir class'dan C02 clasindan method ve variable'lari kullandigimda C02 class'inin
        tamami degil sadece benim cagirdigim class uyeleri calisir.
         */
    }
}
