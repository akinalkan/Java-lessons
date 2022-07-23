package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {

       // 2 tarih arasindaki sureyi bulma

        LocalDate tarih1= LocalDate.of(1982,6,26);
        LocalDate bugun= LocalDate.now();

        Period period=Period.between(tarih1,bugun);
        System.out.println(period);//P40Y27D
        System.out.println(period.getYears());//40




    }
}
