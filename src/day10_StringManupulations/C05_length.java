package day10_StringManupulations;

public class C05_length {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";
        System.out.println(str.length());//str'in karakter sayısını döndürür

        System.out.println(str.charAt(str.length()-1));// son karakterini yazdıralım
        System.out.println(str.charAt(str.length()-3));// sondan 3.  karakterini yazdıralım
        /*
        Java'da null pointer (işaretleyici) bir değer değil,
        karşısına yazıldığı variable'ın hiç bir değer almadığının işaretçisidir

         */
        String str2="";// str2 'ye bir değer atanmışmıdır? cvp:evet
                        //peki bu değer nedir? cvp:hiçlik
        System.out.println(str2.length());

        String str3=null;// str3 'e bir değer atanmışmıdır? cvp:hayır
                        //null bu değer atamamayı işaret etmektedir
        System.out.println(str3.length());// bir değer atanmamış ki nasıl uzunluğu olsun
                                        //NullPointerException olarak hata verir.

              //null bir esitligin karsinda olsa bile bu bir atama degildir
            //esitligin karsisina null yazarsak bu bir atama degildir,
            // null sadece deger atanmadiginin isaretcisidir





    }
}
