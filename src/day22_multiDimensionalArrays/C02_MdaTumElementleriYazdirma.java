package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {
        //Verilen bir multi-dimensional array'in tum
        //elementlerini yazdiran bir method olusturalim


        int [][]sayilar={{1,5,6,9,4},{2,5,5,8},{3,1,6}};
        int [][]rakam={{0,1,},{2,3}};
        for (int i = 0; i < rakam.length; i++) {
            for (int j = 0; j < rakam[i].length; j++) {
                System.out.print(rakam[i][j]+" ");

            }

        }
        System.out.println();

        elementleriYazdir(sayilar);
    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length; i++) {//i=0,1,2 degerleri alacak
            for (int j = 0; j < sayilar[i].length; j++) {//inner array'lerin uzunluguna bagladik
                System.out.print(sayilar[i][j]+" ");


            }


        }


    }
}
