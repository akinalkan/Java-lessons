package day27_staticKeyword;

public class C01 {

    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {

        /*
        Class level da 2 tur variable olusturabiliriz
        1- static variable: diger adi class variable dir
        2- instance variable : obje variable dir

        static variable'lar tum class'tan kullanilabilirken
        instance olanlar sadece static olmayan methodlarda direk kullanilabilir
        instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.

        instance variable'lar obje variable'i oldugu icin herhangi bir satirda
        instance variable'in degerinin ne oldugunu bulmak icin OBJE OLUSTURULAN SATIRDAN itibaren
        kod incelenmelidir
        statik variable'lar class variable'i oldugu icin herhangibir satirda
        static variable'in degerini bulmak icin  CLASS'IN BASINDAN itibaren kod incelenmelidir

         */

        C01 obj1=new C01();
        System.out.println("obj1.rakam'in degeri : "+obj1.rakam);//obj1.rakam'in degeri : 5
        System.out.println("obj1'in sayi degeri : "+sayi);//obj1'in sayi degeri : 10

        obj1.rakam+=1;//5+1=6
        sayi+=1;//10+1=11

        System.out.println("1 arttirdiktan sonra obj1.rakam'in degeri : "+obj1.rakam);//6
        System.out.println("1 arttirdiktan sonra obj1'in sayi degeri : "+obj1.sayi);//11

        C01 obj2=new C01();

        System.out.println("obj2.rakam'in degeri : "+obj2.rakam);//obj1.rakam'in degeri : 5
        System.out.println("obj2'in sayi degeri : "+sayi);//obj1'in sayi degeri : 11

        obj2.rakam++;//5+1=6
        obj2.sayi++;//11+1=12---obj2 yazmaya gerek yok

        System.out.println("1 arttirdiktan sonra obj2.rakam'in degeri : "+obj2.rakam);//6
        System.out.println("1 arttirdiktan sonra obj2'in sayi degeri : "+obj2.sayi);//12




    }
}
