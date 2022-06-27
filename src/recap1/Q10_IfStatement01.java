package recap1;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Y/N ikilisinden birisini giriniz ");
        char cvp=scan.next().toUpperCase().charAt(0);
        if (cvp=='Y'){
            System.out.println("YES");
        }else if(cvp=='N'){
            System.out.println("NO");
        }else{
            System.out.println("Lütfen Y/N ikilisinden birisini giriniz ");
        }








    }
}
