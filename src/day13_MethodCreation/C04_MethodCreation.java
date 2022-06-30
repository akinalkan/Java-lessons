package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
      // input olarak verilen iki integer'ı toplayıp
        // sonucunu yzdıran bir method oluşturun

        int input1=50;
        int input2=20;

        //method 4 adımda oluşturulur
        //1.adım method call
        //2.adım argüment eklenmesi gerekiyorsa ekleyelim
        //eğer method'un return type void den farklı olacakse
        //bir variable oluşturup,method call'u assign edelim
        topla(input1,input2);



    }

    public static void topla(int input1, int input2) {
        //3.adım method deklarasyonun da değiştirilmesi gereken bölümleri değiştir
        //(access modifier ,return type vb...)
        //4.adım eğer return type void dışında bir şeyse
        // return keyword'u ve dönecek değeri hesaplamalıyız
        System.out.println("Girilen iki sayının toplamı: "+(input1+input2));

    }

}
