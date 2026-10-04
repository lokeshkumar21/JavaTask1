public class DomesticTourism extends TourismPackage {

    public DomesticTourism(String packageId, String destination,
                           int days, int travelers, double basePrice) {
        super(packageId, destination, days, travelers, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (getBasePrice() * 0.05);
    }
}