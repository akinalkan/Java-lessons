package day19_Scope;

public class C01_InstanceVariables {
    /*
    class icerisinde her yerden kullanmak istediginiz variablelari class level'da
    (Class'in icersinde ama methodlarin disinda)
    genellikle class variable'lar class'in basinda olusturulur.(sart degil)

    class level'daki variable'lar icin 2 scope vardir
    1- static variables(class variable'lari da denir)
    2-instance(static olmayan) variables(obje variable'i denir)
     */

    int instSayi=20;// static olmayip class level'da oldugu icin instance variable'dir




    public static void main(String[] args) {
        int sayi=10;
       /* System.out.println(instSayi);
       instance variable static olmadigi icin static klup'e uye main method'dan direk kullanamayiz.
       instance variable'larin diger adi object variable'dir
       dolayisiyla obje olusturursaniz instance variable'lari heryerden kullanabilirsiniz
        */
        C01_InstanceVariables obje1=new C01_InstanceVariables();
        System.out.println("obje1 degismeden once : "+obje1.instSayi);//20
        obje1.instSayi=30;
        System.out.println("obje1 degistikden sonra : "+obje1.instSayi);//30

        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println("obje2 degismeden once : "+obje2.instSayi);//20
        obje2.instSayi=25;
        System.out.println("obje2 degistikden sonra : "+obje2.instSayi);//25

        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println("obje3 degismeden once : "+obje3.instSayi);//20
        obje3.instSayi=40;
        System.out.println("obje3 degistikden sonra : "+obje3.instSayi);//40
        /*
        her obje olustugunda instance (obje) variable'inin ilk atanan degerini alir
         */




    }

    public static void staticMethod(){
        //System.out.println(sayi);
        /*
        bir method'un icerisinde olusturulan variable sadece o method'un icinden
        kullanilabilir
        (Locale variable)
         */
        /*
         instance variable'lara main method disindaki static method'lardan da direk ulasamayiz
         obje olustrursak ulasabiliriz
         */
        //instSayi=30;
        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println(obje4.instSayi);


    }
    public void staticOlmayanMethod(){

        System.out.println(instSayi);
        /*
        instance variable'lar class icersindeki static olmayan methodlardan direk kullanilabiir
         */

    }
}
