package day15_overLoadingForLoop;

import java.util.Scanner;

public class C12_Q9_Palindrome {
    public static void main(String[] args) {
         /*
        Soru 9 ) Interview Question
    Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
    palindrome olup olmadigini kontrol eden bir program yazin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println(" palindrom olup olmadığını görmek için bir ifade giriniz");
        String str=scan.next();

        int j=str.length()-1;
        char harf;
        int kontrol=0;

        for (int i=j; i>=0; i-=2){
            if (str.charAt(j)==str.charAt(j-i)) kontrol++;
            j--;
        }
        if (kontrol==((str.length()-1)/2)+1) System.out.println(str+"\t bir palindrome ");
        else System.out.println(str+"\t palindrome değildir");




    }
}
