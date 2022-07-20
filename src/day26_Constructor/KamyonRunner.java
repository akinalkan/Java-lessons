package day26_Constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1 = new Kamyon();//----->parametre yok..instance variable kullaniliyor
        System.out.println("kamyon1 ozellikleri : " + kamyon1.toString());
        System.out.println("************************************************************");

        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,500000);
        System.out.println("Kamyon2 bilgileri : "+kamyon2);//toString yazmasakta olur
        System.out.println("************************************************************");

        Kamyon kamyon3=new Kamyon("MAN","as900",2004,120000);
        System.out.println("Kamyon3 bilgileri : "+kamyon3);
        System.out.println("************************************************************");


         Kamyon kamyon4=new Kamyon("Scania","S540");
        System.out.println("Kamyon4 bilgileri"+kamyon4);
        System.out.println("************************************************************");

        Kamyon kamyon5=new Kamyon("Bedford",2006,125000);
        System.out.println("Kamyon5 bilgileri : "+kamyon5);
        System.out.println("************************************************************");

        Kamyon kamyon6=new Kamyon("Canavar","Deligoz",2020,505000);
        System.out.println("Kamnyon6 bilgileri : "+kamyon6);
        System.out.println("************************************************************");

        Kamyon kamyon7=new Kamyon(2000);
        System.out.println("Kamyon7 bilgileri : "+kamyon7);


    }
}
