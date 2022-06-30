package day09_Ternary;


public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanıcıdan gün ismini alın
        hafta içi veya hafta sonu olduğunu yazdırın
         */
        String input="salı";
        input=input.toLowerCase();

        switch (input) {
            case "pazartesi", "salı", "çarşamba", "perşembe", "cuma" -> System.out.println("Hafta içi");
            case "cumartesi", "pazar" -> System.out.println("Hafta sonu");
            default -> System.out.println("Lütfen geçerli bir gün giriniz");
        }



    }
}
