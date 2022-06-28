package recap1;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {
         /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cm olarak boyunuzu giriniz");
        double boy = scan.nextDouble();

        System.out.println("Lütfen kilonuzu kg olarak giriniz");
        double kilo = scan.nextDouble();

        double bmi=kilo/(boy*boy*(0.0001));

        if(bmi<=20){
            System.out.println("oldukca zayifsiniz");
        } else if (bmi>20 &&bmi<=25) {
            System.out.println("Normal sinirlardasiniz");

        }else if(bmi>25 &&bmi<=30){
            System.out.println("Sisman kategorisindesiniz");
        }else {
            System.out.println("Obez grubundasiniz.");
        }


    }

}
