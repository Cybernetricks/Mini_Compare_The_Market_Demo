package CompareTheMarket.example.demo.model;

public class Quote {
    private String provider;

    private double price;

    private int excess;

    public Quote(String provider, double price, int excess) {
        this.provider = provider;
        this.price = price;
        this.excess = excess;
    }

    public String getProvider() {
        return this.provider;
    }

    public double getPrice() {
        return this.price;
    }

    public int getExcess() {
        return this.excess;
    }
}
