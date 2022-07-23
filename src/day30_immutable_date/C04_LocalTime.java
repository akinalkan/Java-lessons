package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println(time1);//19:33:08.832161500
        /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir
        Local time.now kullandigimiz satirda o anki tarih veya
        saati alip bizim variable'imiza store eder.
        time1 variable'inin degeri sabittir.
         */

        Thread.sleep(3000);//3000 milisaniye bekler

        time1=LocalTime.now();
        System.out.println(time1);//19:33:11.846894600

        System.out.println(time1.getSecond());//11==>saniyeyi soyler

        System.out.println(time1.plusSeconds(10000));//time1 'den 10000 saniye sonra

        System.out.println(time1.minusMinutes(200));//time1 'den 200 dk once

        System.out.println(time1.withHour(3));//saati 3 yapip gerisini ayni yazdirir




    }
}
