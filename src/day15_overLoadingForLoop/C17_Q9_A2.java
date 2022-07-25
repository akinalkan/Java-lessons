package day15_overLoadingForLoop;

import java.util.Scanner;

public class C17_Q9_A2 {
    public static void main(String[] args) {
         /*
        Soru 9 ) Interview Question
    Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
    palindrome olup olmadigini kontrol eden bir program yazin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println(" palindrom olup olmadığını görmek için bir ifade giriniz");
        String input = scan.next();

        String tersInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);

        }
        if(input.equals(tersInput)){
            System.out.println("palindrom");
        }else {
            System.out.println("palindrom degil");
        }


    }
}