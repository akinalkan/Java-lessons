package recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {
        /*
     * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
     * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1.vize notunu giriniz");
        int vize1=scan.nextInt();
        System.out.println("Lütfen 2.vize notunu giriniz");
        int vize2=scan.nextInt();
        double ort=(vize1+vize2)/2;
        System.out.println("Lütfen final notunu giriniz");
        int fnl=scan.nextInt();
        double note=ort*(0.3)+(fnl*0.7);
        System.out.println("Geçme notu = " + note);




    }



}
