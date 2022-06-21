package day03_scanner;


import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini isteyin
        //girilen ismi
        //isminiz :ismail şeklinde yazdırın

        //insanların dünyasından kodlarımızın bulunduğu class 'a değer almak için
        //Scanner class'ni kullanırız
        //1- Scanner objesini oluşturalım
        Scanner scan = new Scanner(System.in);

        //2- kullanıcıya ne istediğimizi söyleyelim
        System.out.println("Lütfen isminizi giriniz");


        //3- oluşturduğumuz scan objesi ile kullanıcının girdiği değeri alıp oluşturacağımız
        // uygun bir variable' a atıyalım

        String kullaniciIsmi = scan.next();
        System.out.println("İsminiz:  " + kullaniciIsmi);


    }
}
