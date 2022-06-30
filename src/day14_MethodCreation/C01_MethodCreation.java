package day14_MethodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen dort harfli bir
        // stringi tersten yazdiran bir method olusturalim
        terstenYazdir("AKIN");
        C04_MethodCreation.topla(6,5);
        C02_MethodCreation.rakamlariTopla(563);

    }
    public static void terstenYazdir(String input){

        String tersInput=input.substring(3)+input.substring(2,3)+input.substring(1,2)+input.substring(0,1);
        System.out.println("Verilen kelimenin tersten yazilisi: "+tersInput);

    }
}
