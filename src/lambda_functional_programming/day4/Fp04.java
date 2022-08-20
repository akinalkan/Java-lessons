package lambda_functional_programming.day4;

import lambda_functional_programming.day2.Utils;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        System.out.println("7'den 100 e Kadar Toplam-1.yol= " + yediden100eKadarToplam());
        System.out.println("7'den 100 e  Kadar Toplam-2.yol= " + yediden100eKadarToplam02());
        System.out.println("2'den 11'e carpim() = " + get2den11eCarpim());
        System.out.println("getNeKadarCarpim() = " + getNeKadarCarpim(5));
        System.out.println("ciftlerToplami = " + verilen2SayiArasindakiCiftlerToplami(1, 10));
        System.out.println("verilen2SayiArasindakiTumSayilarinRakamlarToplami = " + verilen2SayiArasindakiTumSayilarinRakamlarToplami(10, 4));
    }

    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.
    //1.Yol
    public static int yediden100eKadarToplam() {
        return IntStream.range(7, 101).reduce(Math::addExact).getAsInt();//.range(7,101)==> 101 dahil degil[7+8+9...+100]
    }

    //2.Yol
    public static int yediden100eKadarToplam02() {
        return IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();//.rangeClosed(7,100)==> 100 dahil [7+8+9...+100]
    }

    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.
    public static int get2den11eCarpim() {
        return IntStream.rangeClosed(2, 11).reduce(Math::multiplyExact).getAsInt();

    }

    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static int getNeKadarCarpim(int n) {
        if (n > 0 && n < 15) {
            return IntStream.rangeClosed(1, n).reduce(Math::multiplyExact).getAsInt();
        } else if (n == 0) {
            return 1;

        } else {
            System.out.println("0 ile 15 arasinda  deger giriniz");
            return 0;
        }
    }
    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.

    public static int verilen2SayiArasindakiCiftlerToplami(int a, int b) {
        if (a < b) {
            return IntStream.rangeClosed(a, b).filter(Utils::ciftElemanlari).sum();
        } else {
            return IntStream.rangeClosed(b, a).filter(Utils::ciftElemanlari).sum();
        }
    }

    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68
    public static int verilen2SayiArasindakiTumSayilarinRakamlarToplami(int a, int b) {
        if (a < b) {
       return IntStream.rangeClosed(a,b).map(Utils::sayininRakamlarToplami).sum();
        } else {
            return IntStream.rangeClosed(b,a).map(Utils::sayininRakamlarToplami).sum();
        }
    }


}
