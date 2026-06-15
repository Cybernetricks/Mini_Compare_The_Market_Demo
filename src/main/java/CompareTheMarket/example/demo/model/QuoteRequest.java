package CompareTheMarket.example.demo.model;

import jakarta.validation.constraints.Min;

public class QuoteRequest {

    @Min(17)
    private int age;

    @Min(1)
    private int vehicleValue;

    @Min(0)
    private int yearsDriving;

    @Min(0)
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
