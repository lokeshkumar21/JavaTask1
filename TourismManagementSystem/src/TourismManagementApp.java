public class TourismManagementApp {

    public static void main(String[] args) {

        Tourist tourist1 = new Tourist();

        tourist1.setTouristId(101);
        tourist1.setTouristName("Arun");
        tourist1.setEmail("arun@gmail.com");
        tourist1.setPhone("9876543210");


        Tourist tourist2 = new Tourist(
                102,
                "Kumar",
                "kumar@gmail.com",
                "9876543211"
        );

        System.out.println("========================================");
        System.out.println("DHILTOUR TRAVELS");
        System.out.println("========================================");

        System.out.println("\nTourist Details");
        tourist1.displayTouristInfo();

        System.out.println("\n----------------------------------------");

        TourismPackage package1 = new DomesticTourism(
                "TP101", "Goa", 5, 2, 40000
        );

        TourismPackage package2 = new InternationalTourism(
                "TP102", "Paris", 7, 2, 100000
        );

        TourismPackage package3 = new AdventureTourism(
                "TP103", "Manali", 6, 3, 60000
        );

        TourismPackage[] packages = {
                package1,
                package2,
                package3
        };

        for (TourismPackage tourismPackage : packages) {

            System.out.println("\nTourism Package");

            tourismPackage.displayPackageDetails();

            System.out.println("Final Price  : "
                    + tourismPackage.calculateFinalPrice());

            System.out.println("----------------------------------------");
        }
    }
}