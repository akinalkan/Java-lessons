package day13_MethodCreation;

public class C03_StringManipulations {
    public static void main(String[] args) {
                    /*
                    String methodlarını kullanarak " Java ogrenmek123 Cok guzel@ "
                    Stringini " Java ogrenmek cok guzel." şekline getirin
                     */
        String str=" Java ogrenmek123 Cok guzel@ ";
        str=str.trim();
        str=str.replaceAll("\\d","").replace("@",".").replace("C","c");
        System.out.println(str);
    }
}
