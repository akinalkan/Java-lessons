package day09_Ternary;


public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanıcıdan gün ismini alın
        hafta içi veya hafta sonu olduğunu yazdırın
         */
        String input="salı";
        input=input.toLowerCase();

        switch (input){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Hafta içi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lütfen geçerli bir gün giriniz");


        }



    }
}
