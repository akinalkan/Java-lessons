package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        // bir tamsayı ile char değişken oluşturup bunların toplamını yazdırma
        int sayi=10;
        char harf='a';
        String str="banan";

        System.out.println(sayi+harf);//10a değil 107 oldu
        System.out.println(sayi*harf);//970
        System.out.println(sayi-harf);//-87
        System.out.println(str+harf);//banana
        System.out.println(sayi+""+harf);//10a
        System.out.println(harf+2);//99
        System.out.println(str+10);
        System.out.println(str+sayi+harf);//banan10a
       // char yeniHarf=harf+2;


        /*1- char data türü işleme girdiği data türüne göre farklı davrana bilir
        eğer matematiksel işleme girdiği variable sayısal değerse sayi gibi olur
        sayi+harf variable 'i int olduğundan asci tablosundan 97 değerini kullanır.
        char yeniHarf=harf+2; java önce sağdaki işlemi yapar ,sağda int +char görünce
        ascii değerini alır sonucu 99 bulur sonra atam işlemi yapmaya çalışır
        char yeniHarf =99;---> bu atama java açısından kabul edilebilir değildir.
        2- str+harf; // banana string variable çok güçlüdür,hangi data türü ile işleme girerse girsin
        diğer data türünü kendine benzetir

        peki ...konsolda verilen variable'ları kullanarak 10a görmek için ne yapmalıyız?--->(""+sayi+harf) yazmalıyız

         */
        char deger='1';
        System.out.println(deger+harf);/*146 iki char toplanırsa ascii değeri ile toplanır.
                                        '1'+'a'--->49+97=146 olur  */

        char deg=150;// a.....ascii tablosunda a--->97 ye karşılık gelir
        System.out.println(deg);




    }
}
