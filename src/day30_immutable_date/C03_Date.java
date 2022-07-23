package day30_immutable_date;

import java.time.*;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2022-07-23

        System.out.println(tarih.getDayOfYear());//204

        System.out.println(tarih.getDayOfWeek());//SATURDAY

        System.out.println(tarih.getMonthValue());//7

        System.out.println(tarih.isLeapYear());//false

            /*
        LocalTime time=LocalTime.now();
        System.out.println(time);//18:23:57.187835400

        LocalDateTime tarihTime=LocalDateTime.now();
        System.out.println(tarihTime);//2022-07-23T18:23:57.188834700

             */

        LocalDate tarih2=LocalDate.of(1982,6,26);
        System.out.println(tarih2);//1982-06-26
        System.out.println(tarih2.getDayOfWeek());//SATURDAY

        LocalDate tarih3=LocalDate.of(1982, Month.JUNE,26);
        System.out.println(tarih3);//1982-06-26

        System.out.println(tarih.plusDays(100));//2022-10-31

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));//2027-11-04

        System.out.println(tarih.minusWeeks(20));//2022-03-05

        System.out.println(tarih.minusDays(100).minusMonths(5));//2021-11-14

        System.out.println(tarih.isAfter(tarih3));//true

        Period age=Period.between(tarih3,tarih);

        System.out.println(age);//P40Y27D

        int ageYear=Period.between(tarih3,tarih).getYears();
        System.out.println(ageYear);//40
        System.out.println(tarih.lengthOfMonth());//31





    }
}
