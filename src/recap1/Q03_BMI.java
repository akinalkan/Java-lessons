package recap1;

import java.util.Scanner;

public class Q03_BMI {
    public static void main(String[] args) {
        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen kilonuzu kg olarak giriniz :");
        double kilo=scan.nextDouble();//86
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz :");// 1,83
        double boy=scan.nextDouble();
        int vki=(int )(kilo/(boy*boy));//25
        System.out.print("Vucut Kitle Indeksiniz :"+vki);



    }


}
