package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

        char harf = 'a';
        char yeniHarf = (char) (harf + 1);        // kod bu durumda önce sağdaki işlemi yapar
        // char yeniHarf =97+1 --->98
        // char bir variable 98 olamayacağı için java hata verir
        /*System.out.println(yeniHarf);   // b
        int i;

        for(i=1;i<25;i++){
            System.out.println((char)(yeniHarf+i)); // alfabe
        }*/
        /*
        bazen bir variable'a oluşturulduğu data türü dışında değer atanabilir
        bunlardan bazısını java otomatik olarak kabul eder

        Java eğer bu değer atamasında sorun oluşacağını (data kayıpların olabileceğini
        veya datanın başkalaşabileceğini) görürse bu durumda otomatik olarak bu atamayı kabul etmez
        sizden sorumluluğu kabul etmenizi ister
         */
        int sayi1 = (int) (7.3);  //  (...) içine algılanması istenen veri tipinde yazacağız
        System.out.println(sayi1); // 7
        double sayi2 = 10; //10.0
        System.out.println(sayi2);

        int sayi3 = 'c';    //  99
        System.out.println(sayi3);

        char harf2 = 98;
        System.out.println(harf2); //  b
        int sayi5=(byte)250;
        System.out.println(sayi5); // -6




    }
}
