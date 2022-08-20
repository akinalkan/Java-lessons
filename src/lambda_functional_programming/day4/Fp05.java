package lambda_functional_programming.day4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp05 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);
        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        for ( Courses w:coursesList) {
            System.err.println(w+"\n ");
        }


        System.out.println("ortalama Istenenden BuyukMu = " + ortalamaIstenendenBuyukMu(coursesList, 90));
        System.out.println("kelimeyi Iceren Kurs = " + kelimeyiIcerenKurs(coursesList, "Day"));
        ortalamasiEnYuksekKursAdiYazdir(coursesList);
        System.out.println("ortalama Puana Gore Sirala Ve Ilk" +
                "VerilenleriAtla = " + ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(coursesList, 1));

    }
    //1)Tüm ortalama puanların verilen sayıdan büyük olup olmadığını kontrol etmek için bir method oluşturun.
    public static boolean ortalamaIstenendenBuyukMu(List<Courses> list,int x){
      return list.stream().allMatch(t->t.getAverageScore()>x);
    }
    //2)Kurs adlarından en az birinin verilen kelimeyi içerip içermediğini kontrol etmek için bir method oluşturun
    public static boolean kelimeyiIcerenKurs(List<Courses> list,String str){
        return list.stream().anyMatch(t->t.getCourseName().contains(str));
    }
//3) Ortalama puanı en yüksek olan kursu yazdırmak için bir yöntem oluşturun
    public static void ortalamasiEnYuksekKursAdiYazdir(List<Courses> list){
        String kurs= list.stream().max(Comparator.comparing(Courses::getAverageScore)).get().getCourseName();
        int puan= list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getAverageScore();
        System.out.println(kurs+" "+puan);
    }
    //4) List öğelerini artan düzende ortalama puana göre sıralayın ve ilk verilenleri atlayın
    public static List<Courses> ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(List<Courses>list,int atla){
        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(atla).collect(Collectors.toList());

    }
}
