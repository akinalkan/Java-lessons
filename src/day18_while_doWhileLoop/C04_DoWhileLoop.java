package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan tamsayilar alin
        kullanici cift sayi girdigi muddetce sayiyi yazdirin
        kullanici tek sayi girince islemi bitirin
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;

        //while ile****
        /*
        Loop'larda kullanacagimiz variable'lari looptan once olusturmaliyiz
        while loop'da loopdan once olusturdugumuz bu variable'a atayacagimiz degeri
         iyi dusunmeliyiz

         */
        int toplam=0;


        while(sayi%2==0){

            System.out.print("Lutfen bir sayi giriniz : ");
            sayi=scan.nextInt();

            if(sayi%2==0){
                System.out.println("Girilen sayi cift : "+sayi);
                toplam+=sayi;
            }else{
                toplam+=sayi;
                System.out.println("Girilen sayi tek");
            }


        }
        System.out.println("Girilen sayilar toplami : "+toplam);
        System.out.println("");
        System.out.println("*******************");

        // do while ile yapalim
        /*
        do while loop'da onceden olusturulan variable'a hangi degeratadiginin
        hic bir onemi yok,kodumuz her durumda calisir
         */
        /*
        do while'in dezavantaji :
          ilk calistirma kontrol yapilmadan oldugu icin
          loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
         */

            int toplam2=0;
        do{
            System.out.print("Lutfen bir sayi giriniz : ");
            sayi=scan.nextInt();

            if(sayi%2==0){
                System.out.println("Girilen sayi cift : "+sayi);
                toplam2+=sayi;
            }else{
                toplam2+=sayi;
                System.out.println("Girilen sayi tek");
            }


        }while(sayi%2==0);
        System.out.println("Girilen sayilar toplami : "+toplam2);
        }


        }


