package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_MdaSonElemanlariCarpma {
    public static void main(String[] args) {
        /*
        Soru 2) Asagidaki multi dimensional array’in

        ic array’lerindeki son elemanlarin carpimini

         ekrana yazdiran bir program yaziniz

         { {1,2,3}, {4,5}, {6} }

         */
        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};
        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j == arr[i].length - 1) {
                    carpim *= arr[i][j];

                }
            }


        }
        System.out.println("Son elemanlarin carpimi : " + carpim);


        System.out.println("***********************************************************");
        System.out.println();
        int[][] arr1 = {{1, 2, 3}, {4, 5}, {6}};
        int carpim1 = 1;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {


                    carpim1*= arr[i][j];


            }


        }
        System.out.println("Tum elemanlarin carpimi : " + carpim1);
        System.out.println("***********************************************************");

        List<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        System.out.println("list = " + list);
        limitIslemi(list);
    }
    public static void limitIslemi(List<Integer> list){
        System.out.println(list.stream().filter(t->t>20).limit(3).toList());
    }

}
