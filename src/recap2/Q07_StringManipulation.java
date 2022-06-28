package recap2;

public class Q07_StringManipulation {
    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */
        String str1="$13.99";
        String str2="$10.55";
        String str3=str1.substring(1);
        String str4=str2.substring(1);
        System.out.println(str3);
        System.out.println(str4);
        double sayi1=Double.parseDouble(str3);
        double sayi2=Double.parseDouble(str4);
        System.out.println(str1+"+"+str2+"="+"$"+(sayi1+sayi2));




    }

}
