package recap2;


public class Q01_SwitchCase {
    public static void main(String[] args) {
            /*
        gunleri gösterebilen bir program yazın
        gun Pazartesi veya Sali ise:
        Java dersi gunleri
        gun Persembe veya Cuma ise:
        Selenyum dersi gunleri
        gun carsamba veya cumartesi ise:
        SQL dersi gunleri
        aksi halde: izin gunu
        (if deyimini KULLANMAYIN)
        */
        String gun = "PAzartesi";
        String gun2 = gun.toLowerCase();
        switch (gun2) {
            case "pazartesi", "salı" -> System.out.println("Java dersi gunleri");
            case "çarşamba", "cumartesi" -> System.out.println("SQL dersi gunleri");
            case "persembe", "cuma" -> System.out.println("Selenyum dersi gunleri");
            default -> System.out.println("izin gunu");
        }


    }
}
