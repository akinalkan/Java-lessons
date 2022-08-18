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
    public static double karekokAl(double x){
        return Math.sqrt(x);
    }

}
