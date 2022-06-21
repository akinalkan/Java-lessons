package day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {
        /*
        Bir if statement'da { kullanılmazsa Java ilk satırı şart ile bağlar
        sonraki satırlar bağımsız olur.
        Eğer birden fazla satır aynı if şartına bağlanmış ise mutlaka { kullanmalıyız
         */
        int sayi=23;
        if(sayi>0){
            System.out.println("sayı pozitiftir");
            System.out.println("pozitif kalacaktır");

        }
        if(sayi%2==0){
            System.out.println("sayı çifttir");
            System.out.println("çift kalacaktır");


        }
        if(sayi%5==0){
            System.out.println("sayı 5 in tam katıdır");
            System.out.println("5 in tam katı kalacaktır");
        }
    }
}
