package recap2;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz: ");
        String isim = scan.nextLine();
        String buyukIsım = isim.toUpperCase();
        System.out.print("Lütfen soyisminizi giriniz: ");
        String soyIsim = scan.nextLine();
        String buyuksoyIsım = soyIsim.toUpperCase();
        System.out.println(buyukIsım + " " + buyuksoyIsım);


    }
}
