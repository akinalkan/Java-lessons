package day09;

import java.util.Scanner;

public class Practice2_1_NestedTernary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char kar=scan.next().charAt(0);
        System.out.println(kar>='a' &&  kar<='z' ? "küçük harf":(kar>='A' && kar<='Z' ? "büyük harf":"girdiğiniz karakter harf değil"));



    }


}
