package day18_while_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */

        char ilkHarf='f';
        char sonHarf='t';
        String buyult="";

        char temp=ilkHarf;

        while(temp<=sonHarf){
            buyult = (temp + "").toUpperCase();// char string'e cevrilip buyuk harf yapildi
            System.out.print(buyult+" ");
            temp+=1;
        }





    }
}
