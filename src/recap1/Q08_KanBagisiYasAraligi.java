package recap1;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {
    public static void main(String[] args) {

        /*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu aliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindan buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();

        System.out.println("Lütfen kilonuzu kg olarak giriniz");
        double kilo = scan.nextDouble();
        if(yas<18){
            System.out.println("kan bagisi yapamazsınız");
        } else{
            if (kilo<50) {
            System.out.println("kan bagisi yapamazsınız");

        }else {
                System.out.println("kan bagisi yapabilirsiniz");
            }

        }


    }



}
