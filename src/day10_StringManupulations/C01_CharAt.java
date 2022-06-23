package day10_StringManupulations;

public class C01_CharAt {
    public static void main(String[] args) {
        String str="Java öğrenmek ne güzel";
        System.out.println(str.charAt(0));//ilk harfi yazdırır J
        System.out.println(str.toUpperCase().charAt(7));// R
        System.out.println(str.charAt(21));// l
       // System.out.println(str.charAt(21));// hata verir
        /*
        son harfi bulmak için str uzunluğunun 1 eksiğini index olarak gireriz
        eğer index olarak uzunluğu veya daha bir sayıyı girersek Java exception verir

        charAt() kullandığımızda sonuç char olacagı için artık maniplasyon yapamayız
        String methodlarından kullanmamiz gereken bir method varsa
            charAt() 'den önce kullanmaliyiz

         */
    }
}
