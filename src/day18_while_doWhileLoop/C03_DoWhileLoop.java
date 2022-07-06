package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        while loop'da once kontrol edip sonra islem yaptigimiz icin
        islem bittikten sonra loop'un kirilmasi icin
        1 kez daha basa donmemiz gerekiyor
        bu durumda fazladan 1 islem yapiliyor
         */


        int sayi=7;


        while(sayi<10){

            System.out.println(sayi);

            sayi++;

        }
        System.out.println("*******************");
        /*
        do-while loop ile calistigimizda bu dezavantaj kalkar
         */
        sayi=7;
        do{
            System.out.println(sayi);
            sayi++;

        }while(sayi<10);


    }
}
