package day15_overLoadingForLoop;

import java.util.Scanner;

public class C13_Q7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir String yaziniz");
        String str=scan.nextLine();

        String tersStr=str.substring(str.length()-1);
        for(int i=str.length()-2 ; i>=0 ; i--){
            tersStr+=str.substring(i,i+1);
        }
        System.out.println(tersStr);



    }
}
