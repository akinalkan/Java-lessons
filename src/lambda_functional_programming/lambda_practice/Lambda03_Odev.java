package lambda_functional_programming.lambda_practice;

import java.util.Arrays;

public class Lambda03_Odev {//odev

        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar
        // tamsayilari toplayan bir program create ediniz.
        //Structured(AMELE) Programming
        public static int toplaAmele(int i) {
            int toplam=0;
            for (int j = 1; j <=i ; j++) {
                toplam+=j;


            }

            return toplam;
        }
        //TODO Functional(cincix Programming
        public static int toplaCincix(int...x) {


            return 0;
        }
        //TODO TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
        public static int toplaCift(int x) {


            return 0;
        }
        //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
        public static int toplaIlkXCift(int x) {

            return 0;
        }
        //TODO TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
        public static int toplaIlkXTek(int x) {

            return 0;
        }
        //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
        public static void ikininIlkXKuvvetPrint(int x) {


        }
        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
        public static void isteneSayiIlkXKuvvetPrint(int istenenSayi,int x) {


        }
        // TODO TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
        public static int istenenSayiFactorial(int x) {

            return 0;
        }

        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
        public static double xKuvveti(int sayi, int x) {

            return 0;
        }
    /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm
elemanları bir
listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
*/
    String[][] arr = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};

    public static void main(String[] args) {
        System.out.println(toplaAmele(20));
        System.out.println(toplaCincix(20));
    }

    }



