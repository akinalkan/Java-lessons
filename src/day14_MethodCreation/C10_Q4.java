package day14_MethodCreation;

import java.util.Scanner;

public class C10_Q4 {
    public static void main(String[] args) {
        String kullanici=kullaniciAdi();
        String kartNumarasi=kartNo();

    }
    public static String kullaniciAdi(){
        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen isminizi giriniz: ");
        String isim=scan.nextLine();

        System.out.print("Lutfen soyisminizi giriniz: ");
        String soyisim=scan.nextLine();

        char isimIlkharf=isim.toUpperCase().charAt(0);
        String isimKalan=isim.substring(1).toLowerCase();
        String isimSon=isimIlkharf+isimKalan;

        char soyisimIlkharf=soyisim.toUpperCase().charAt(0);
        String soyisimKalan=soyisim.substring(1).toLowerCase();
        String soyisimSon=soyisimIlkharf+soyisimKalan;
        String kullaniciAdi=isimSon+" "+soyisimSon;
        System.out.println(kullaniciAdi);

        return kullaniciAdi;
    }
    public static String kartNo(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 16 haneli kart numaranizi aralarinda bosluk birakmadan yaziniz");
        String kart=scan.nextLine();
        String kart1=kart.substring(0,4);
        String kart2=kart.substring(4,8);
        String kart3=kart.substring(8,12);
        String kart4=kart.substring(12);
        String kartSon=kart1+" "+kart2+" "+kart3+" "+kart4;
        System.out.println(kartSon);

        return kartSon;



    }

}
