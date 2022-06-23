package day10_StringManupulations;

public class C06_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t"));//bana integer döndürüyor
                                            // int'de yok diye bir değer bulunmuyor
                                            //0 dersek J'nin index'idir.
                                            //- bir değer dönerse biz aranan string'in str'da olmadığını anlarız
                                            //Java -1 döndürmeyi tercih etmiştir
        String str5="qwertyuıopğüasdfghjklşizxcvbnmöç";
        //str5'de p harfi varmıdır?
        if(str5.indexOf("p")==-1){
            System.out.println("str5' de istenen karakter kullanılmamıştır");

        }else{
            System.out.println("str5' de istenen karakter kullanılmıştır");
        }
    }
}
