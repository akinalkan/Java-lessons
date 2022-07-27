package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(6,"Ayse","Ismail","Ahmet","abcdef","abra kadabra",
                "kisisellestireveremeyebileceklerimizdenmiscesinedir");

        /*
        Varargs teorik olarak sonsuz sayida element alabilir
        bir method'da parametre olarak varargs varsa
        varargs'in sinirlarini bilebilmesi icin parametrelerin sonuncusu olmalidir.
        Oncesinde farkli parmetreler olabilir ama varargs'dan sonra parametre olamaz

        Bu kuraldan oturu bir method'da sadece bir tane varargs bulunabilir
         */
        new C05_VarargsParametreIleKullanma().Go(1,"Hello");
        new C05_VarargsParametreIleKullanma().Go(2,"Hello", "hi");
    }
    public void Go(int x, String... y){
        System.out.print(y[y.length-x]+" ");//Hello Hello
    }




    public static void enUzunKelimeyiYazdir(int kelimeSayisi ,String ... kelime) {

        String enUzunKelime=kelime[0];

        for (String each:kelime) {
            if(each.length()>=enUzunKelime.length()){
                enUzunKelime=each;

            }

        }
        System.out.println("En Uzun Kelime = " + enUzunKelime);
    }
}
