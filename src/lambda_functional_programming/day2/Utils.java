package lambda_functional_programming.day2;

import java.util.List;

public class Utils {
    public static void print_(Object str){
        System.out.print(str+" ");
    }
    public static boolean ciftElemanlari(int x){
        return x % 2 == 0;
    }
    public static boolean tekElamanlari(int x){
        return x % 2!=0;
    }
    public static int kareAl(int x){
        return x*x;
    }
    public static int kupAl(int x){
        return x*x*x;
    }
    public static double karekokAl(int x){
        return Math.sqrt(x);
    }
    public static Integer maxElemanArr(Integer[] arr){
        int max = 0;
        for (Integer integer : arr) {
            if (max <= integer) {
                max = integer;
            }
        }

   return max;
    }
    public static int elemanlarToplami(List<Integer>list){
        int toplam=0;
        for (Integer w:list) {
        toplam+=w;
        }
    return toplam;
    }
    public static double yarisiniAl(int x){
        return x/2.0;
    }
    public static String sonKarakteriAl(String str){
        String son ="";
        String[] arr=str.split("");
        son=arr[str.length()-1];

        return son;
    }
    public static  char sonKarakter2(String str){
        return str.charAt(str.length()-1);
    }
    public static  char ilkKarakterAl(String str){
        return str.charAt(0);
    }
    public static int sayininRakamlarToplami(int sayi){
        int rakamlarToplami=0;

        while (sayi>0){
            rakamlarToplami+=sayi%10;
            sayi/=10;
        }
        return rakamlarToplami;
    }


}
