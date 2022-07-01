package day15_overLoadingForLoop;

public class C02_OverLoading {
    public static void main(String[] args) {

        /*
        Java'da olusturdugumuz methodlarin ismini
        yaptigi islev ile uyumlu olmasini isteriz
        Mesala bir string'in bir bolumunu almak icin Java 2 adet substring() method'u
        veya verilen string'deki bazi parcalari yenileri ile de;gistirmek icin
        2 adet replace() method'u var

        Java ayni isimde birden fzla method varsa
        hangisinin kullanilacagina parametre sayisi ve
        paramaetrelern data turune gore karar verir.

         */
        String str="Bu Java ogrenilecek baska yolu yok";
        str.substring(2);
        str.substring(2,5);
        str.replace('c','v');
        str.replace("J","H");
        /*
        ayni isimde ama farkli methodlar olusturmak icin
        degistirecegimiz seyler:
        1-parametre sayisi
        2-ayni sayida parametreye sahip olsa bile parametre turlerini degistirebiliriz
        3-ayni sayida ve ayni data turunde parametreleri olan methodlarda parametrelerin siralanisi
         */



    }
}
