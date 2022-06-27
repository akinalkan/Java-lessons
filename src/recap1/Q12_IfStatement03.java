package recap1;

import java.util.Scanner;

public class Q12_IfStatement03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
     */
        System.out.print("Lütfen iş ünvanınızı giriniz(qa,dev,ba,pm): ");
        String jobTitle = scan.nextLine().toLowerCase();
        switch (jobTitle) {
            case "qa" -> System.out.println("Quality Analyst");
            case "dev" -> System.out.println("Developer");
            case "ba" -> System.out.println("Business Analyst");
            case "pm" -> System.out.println("Project Manager");
            default -> System.out.println("Lütfen iş ünvanınızı: qa,dev,ba,pm'den birini seçiniz");
        }
        /*
         if (jobTitle.equals("qa")) {
            System.out.println("Quality Analyst");
        } else if (jobTitle.equals("dev")) {
            System.out.println("Developer");

        } else if (jobTitle.equals("ba")) {
            System.out.println("Business Analyst");

        } else if (jobTitle.equals("pm")) {
            System.out.println("Project Manager");

        } else {
            System.out.println("Lütfen iş ünvanınızı: qa,dev,ba,pm'den birini seçiniz");
        }
         */
        /*
        switch (jobTitle){

           case "qa":
               System.out.println("Quality Analyst");
               break;
           case "dev":
               System.out.println("Developer");
               break;
           case "ba":
               System.out.println("Business Analyst");
               break;
           case "pm":
               System.out.println("Project Manager");
               default :
               System.out.println("Lütfen iş ünvanınızı: qa,dev,ba,pm'den birini seçiniz");

         */


    }
}
