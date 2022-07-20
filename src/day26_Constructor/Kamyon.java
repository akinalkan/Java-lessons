package day26_Constructor;

public class Kamyon {
    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
       this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
        /*
        bizim temel amacimiz KamyonRunner'da argument olarak girilen
        degerin Kamyon class'inda instance variable'a atanmasi
        Ancak scope konusunda ogrendigimiz gibi Kamyon constructor
        scope'unda marka oldugu icin instance markaya gitmiyor

        Bu karisikligi gidermek icin instance variable'lari belirli hale getrimemiz lazim
        Java bunun icin this keyword'u olusturmustur

        Genel kullanim acisindan this keyword'u kodu herkesin
        anlamasini kolaylastirdigi icin tercih edilir
         */

    }
    public Kamyon(){ //-->default yerine olusturduk

    }


    public Kamyon(String marka, int yil, int fiyat) {
        this.marka = marka;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(int yil) {
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "" +
                "\n marka=" + marka +
                "\n model=" + model +
                "\n yil=" + yil +
                "\n fiyat=" + fiyat
                ;
    }

}
