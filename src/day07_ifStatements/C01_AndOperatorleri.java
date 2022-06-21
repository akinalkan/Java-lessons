package day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a > 0 && b < 20 && c >= b); //true

        System.out.println(a < 0 && b < 20 && c >= b);// false
        /*
        Java and operatoru konusunda bize iki seçenek sunar
        && kullanırsak ilk false bulduğunda artik sonucun false olacağını bilir
        ve geriye kalan şartları incelemez
        & kullanılırsa tüm şartları kontrol eder sonra sonucu belirler
        bundan dolayı & operatörü && operatörüne göre daha yavaştır
         */
        System.out.println(a < 0 & b < 20 & c >= b);// false





    }
}
