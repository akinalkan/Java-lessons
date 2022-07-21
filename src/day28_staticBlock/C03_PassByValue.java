package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyati=100;
        double indirimOrani=25;

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);    //satisFiyatinin value'si
                                                                    // method'daki satisFiyati'ye gecer(100)
        System.out.println("indirimliFiyat = " + indirimliFiyat);//75.0
        System.out.println("indirimliFiyat = " + indirimliFiyat);//75.0
        System.out.println("indirimliFiyat = " + indirimliFiyat);//75.0
        System.out.println("indirimliFiyat = " + indirimliFiyat);//75.0
        
        double satis=satisAdeti(satisFiyati);//2. bir method'da yine orjinal deger kullaniliyor
        System.out.println("satis = " + satis);

    }

    public static double satisAdeti(double satisFiyati) {
        double satisadet=satisFiyati/10;
        return satisadet;
    }

    public static double indirimliFiyatHesapla(double satisFiyati,double indirimOrani) {

        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);
        return indirimliFiyat;
    }


}
