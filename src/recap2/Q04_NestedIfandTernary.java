package recap2;

import java.util.Scanner;

public class Q04_NestedIfandTernary {
    public static void main(String[] args) {
                 /*
            0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
           kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
           cikis "Gecersiz" olmalidir
           NestedIf ve Ternary kullanarak 2 yolla da cozunuz
                 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir rakam giriniz: ");
        int rakam= scan.nextByte();
        System.out.print(rakam<0||rakam>9?"Gecersiz":rakam==0?"sıfır":rakam==1?"bir":rakam==2?"iki"
                :rakam==3?"üç":rakam==4?"dört":rakam==5?"beş":rakam==6?"altı"
                :rakam==7?"yedi":rakam==8?"sekiz":rakam==9?"dokuz":"Gecersiz");



    }
}
