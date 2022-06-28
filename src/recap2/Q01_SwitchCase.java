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
            case "pazartesi":
            case "salı":
                System.out.println("Java dersi gunleri");
                break;
            case "çarşamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            default:
                System.out.println("izin gunu");

        }


    }
}
