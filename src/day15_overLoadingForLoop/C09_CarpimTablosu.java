package day15_overLoadingForLoop;

public class C09_CarpimTablosu {
    public static void main(String[] args) {
        System.out.println("*****Carpim Tablosu******");
        for (int i = 1; i <=10 ; i++) {
            System.out.println("*************************");
            for (int j = 1; j <=10 ; j++) {

                System.out.println(i+" * "+j+" = "+(i*j));


            }
            System.out.println("*************************");

        }
    }

}
