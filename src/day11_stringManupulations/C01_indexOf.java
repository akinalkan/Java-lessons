package day11_stringManupulations;

public class C01_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";
        /*
        Verilen bir String'de herhangi bir String veya char'in
        ilk kullanıldığı index'i bize döndürür.
         */
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("r"));//7
        System.out.println(str.indexOf("j"));//-1
        System.out.println(str.indexOf("mek"));//10

        //eğer istediğimiz index'ten sonrasını kontrol etmek istersek
        // o zaman aynı method'u 2 parametreli kullanabiliriz
        System.out.println(str.indexOf("g",(6+1)));//6
        //yukarıda kş str' da 2. ve 3. e'nin indexlerini bulunuz
        // 2. e'yi bulabilmek için 1. e' nin index'ine ihtiyacımız var
        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);

        //eğer 2. e varsa 3. e nin olup olmadığını
        // ve varsa index 'ini yazdıralım

        if(ikincie==-1){
            System.out.println("verilen str'da 2. e yok");
        }else{
            int ucuncue=str.indexOf("e",ikincie+1);
            if(ucuncue==-1){
                System.out.println("verilen str'da 3. e yok");
            }
            else{
                System.out.println("verilen str'daki 3.e'nin index'i:"+ ucuncue);
            }
        }



    }

}
