package day25_Constructor;

public class Car {
    /*
    **************Bu class bizim kalip hanemiz**************

    * Bir araba olusturmak icin ihtiyacimiz olan variable
    ve method'lari bu class'da belirleriz

    * Sonra farkli class'lardan araba olusturmamiz gerekirse
    bu class'dan bir obje olusturup,
    burada belirlenen variable ve method'lara gore araba uretir
     */
   public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir.");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+" km hiz yapar");
    }

}
