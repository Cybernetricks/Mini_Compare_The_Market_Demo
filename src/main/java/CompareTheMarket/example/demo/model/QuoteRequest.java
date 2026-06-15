package CompareTheMarket.example.demo.model;

public class QuoteRequest {
    private int age;

    private int vehicleValue;

    private int yearsDriving;

    private int claims;

    public QuoteRequest(int age, int vehicleValue, int yearsDriving, int claims) {
        this.age = age;
        this.vehicleValue = vehicleValue;
        this.yearsDriving = yearsDriving;
        this.claims = claims;
    }

    public int getAge() {
        return this.age;
    }

    public int getVehicleValue() {
        return this.vehicleValue;
    }

    public int getYearsDriving() {
        return this.yearsDriving;
    }

    public int getClaims() {
        return this.claims;
    }
}
