package recap1;

import java.util.Scanner;

public class Q10_NestedTernary {
    public static void main(String[] args) {
        /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu A,B yada C olarak giriniz");
        char fnlnot=scan.next().charAt(0);
        if(fnlnot=='A'){
            System.out.println("Gayet Basarili");
        }else if(fnlnot=='B'){
            System.out.println("Basarili");
        }else if(fnlnot=='C'){
            System.out.println("Ha gayret");

        }else {
            System.out.println("Digerleri.. ");
        }
        System.out.println(fnlnot=='A'?"Gayet Basarili":fnlnot=='B'?"Basarili":fnlnot=='C'?"Ha gayret":"Digerleri.. ");


    }


}
