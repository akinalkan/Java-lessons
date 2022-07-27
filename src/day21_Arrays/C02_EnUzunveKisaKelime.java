package day21_Arrays;

public class C02_EnUzunveKisaKelime {
    /*
    Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun
     */
    public static void main(String[] args) {
        String [] isimler={"Erdal","Onur","Mehmet","Hayrullah","Mihrican"};

        enUzunVeKisayiYazdir(isimler);

    }

    public static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzunKelime=isimler[0];
        String EnKisaKelime=isimler[0];

        for (int i = 1; i < isimler.length ; i++) {
            if(isimler[i].length()>enUzunKelime.length()){
                enUzunKelime=isimler[i];

            }
            if(isimler[i].length()<EnKisaKelime.length()){
                EnKisaKelime=isimler[i];

            }

        }
        System.out.println("EnKisaKelime = " + EnKisaKelime);
        System.out.println("enUzunKelime = " + enUzunKelime);




    }
}
