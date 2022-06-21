package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {


        int sayi1=300;

        byte sayi2= (byte) sayi1;
        System.out.println(sayi2); //  44
      /*
      geniş data türündeki değeri dar data türündeki variable 'a atamak isterseniz
      Java sizin geniş data türündeki değerin dar data türünün sınırlarına uyup uymayacağını bilemez
      ama Java risk almaz
      Riski 0 'a indirmek için burada bir sorun olursa bunun sorumluluğu almanızı bekler
      bunun için değerin önüne parantez içine istenen data türünü yazmamız yeterlidir.
      bu riski üstlendiğimizde 3 durum var
      1- bizim değerimiz dar kaıp değerlerine uygun olursa hiç bir kayıp olmadan cast olur
      2- double bir sayıyı int ' a cast etmek gibi durumlar da data kaybı yaşayabilirsiniz
      3- geniş kalıptan değeri dar kalıba koyduğunuz da ,sınırları aşan
      durumlar da veri başkalaşabilir

       */

    }
}
