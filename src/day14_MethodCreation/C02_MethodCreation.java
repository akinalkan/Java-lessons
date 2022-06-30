package day14_MethodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
        public static void main(String[] args) {
        //Verilen 3 basamakli bir sayinin
        // rakamlari toplamini yazdiran bir method olusturalim

            int input=423;
            rakamlariTopla(input);
            C04_MethodCreation.topla(6,3);
            C01_MethodCreation.terstenYazdir("Akin");




        }

    public static void rakamlariTopla(int input) {
            int birlerBasamagi=0;
            int rakamlarToplami=0;

            birlerBasamagi=input%10;
            rakamlarToplami+=birlerBasamagi;;
            input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        System.out.println("rakamlar toplami: "+rakamlarToplami);


    }

}
