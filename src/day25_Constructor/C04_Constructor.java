package day25_Constructor;

public class C04_Constructor {
    public static void main(String[] args) {

        C03 obj1=new C03();

        obj1.method01();//C03 method calisti
        System.out.println(obj1.isim);//Etka
        obj1.isim="Ali";
        System.out.println(obj1.isim);//Ali


    }

}
