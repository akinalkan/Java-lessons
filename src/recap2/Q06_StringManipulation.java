package recap2;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 1. kelimeyi giriniz: ");
        String str1 = scan.next();
        System.out.print("Lütfen 2. kelimeyi giriniz: ");
        String str2 = scan.next();
        System.out.println(str1.concat(str2));
        String str4 = str1.substring(1);
        String str5 = str2.substring(1);
        System.out.println(str4.concat(str5));


    }
}
