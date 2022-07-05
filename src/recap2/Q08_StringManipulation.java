package recap2;

import java.util.Scanner;

public class Q08_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime yazınız: ");
        String str = scan.next();
        if (str.length() >= 3) {
            for (int i = 1; i <= 3; i++) {
                String str1 = str.substring(str.length() - 2);
                System.out.print(str1);
            }
        } else {
            System.out.print(str);
        }

    }

}
