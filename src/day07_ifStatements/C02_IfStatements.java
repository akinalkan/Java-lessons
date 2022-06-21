package day07_ifStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int sayi=-32;
        if(sayi>0){
            System.out.println("sayı pozitiftir");

        }
        if(sayi%2==0){
            System.out.println("sayı çifttir");

        }
        if(sayi%5==0){
            System.out.println("sayı 5 in tam katıdır");
        }
        /*
        basit if cümleleri kodun diğer parçalarından bağımsızdır
        sadece bir şart kontrol eder,şart sağlanıyorsa if body  çalışır
        yoksa çalışmaz.birden fazla if cümlesi varsa girilen şarta bağlı olarak
        tumunde if body si çalışabilir,kısmen yada hiç biri çalışmaya bilir
         */
    }
}
