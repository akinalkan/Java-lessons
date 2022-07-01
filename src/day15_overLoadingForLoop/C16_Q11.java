package day15_overLoadingForLoop;

import java.util.Scanner;

public class C16_Q11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen [0,9]dan  bir tamsayi giriniz: ");
        int sayi= scan.nextInt();
        int faktoriyel=1;
        for(int i=sayi ; i>=1 ; i--){
            faktoriyel*=i;
        }
        System.out.println("Girilen sayinin faktoriyeli: "+faktoriyel);
    }
}
