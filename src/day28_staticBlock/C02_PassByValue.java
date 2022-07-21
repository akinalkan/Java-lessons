package day28_staticBlock;

public class C02_PassByValue {

    public static void main(String[] args) {
        double satisFiyati=100;
        System.out.println(indirimliFiayat(satisFiyati));//90

        System.out.println(satisFiyati);//100

        System.out.println(indirimliFiayat(satisFiyati));//90
        //iki farkli method'da satis fiyati isminde variable olabilir
        //Java buna itiraz etmez cunku scope'leri farklidir

    }

    public static double indirimliFiayat(double orjinalFiyat){
        /*
        method'umuz %10 indirim yapip yeni fiyati main method'a dondursun
         */
        double satisFiyati=orjinalFiyat*0.9;

        return satisFiyati ;

    }
}
