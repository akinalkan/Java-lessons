package day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = sayi1 + 1; // sayi2--> 11

        sayi2 += 5;  // sayi2-->16
        System.out.println(sayi1 + " " + sayi2);

        /*
        pre veya post increment/decrement sadece ++ ve -- işlemi için geçerlidir
        bu iki işlem için sayıdan sonra veya önce yazılmasına göre farklı iki işleyiş olur
         */
        //post increment
        int sayi3 = sayi2++; // 1- sayı2 değeri sayı3 'e atanacak
                            // 2- sayı2 bir arttırılacak
        System.out.println("sayi3: " + sayi3);
        System.out.println("sayi2: " + sayi2);

        //pre increment
        int sayi4 = ++sayi1;  // 1- sayı1 bir arttırılacak
                              // 2- sayı1 değeri sayı4 'e atanacak
        System.out.println("sayi1: " + sayi1);
        System.out.println("sayi4: " + sayi4);


    }
}
