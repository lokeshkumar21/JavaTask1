public class InternationalTourism extends TourismPackage {

    public InternationalTourism(String packageId, String destination,
                                int days, int travelers, double basePrice) {
        super(packageId, destination, days, travelers, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice()
                + (getBasePrice() * 0.10)
                + (getBasePrice() * 0.08);
    }
}