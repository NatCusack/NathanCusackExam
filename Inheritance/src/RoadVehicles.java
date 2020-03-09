public class RoadVehicles
{
    private int numberOfWheels = 4;
    private double noughtToSixty = 6.5;
    private int numberOfPeople = 5;
    private String engineType = "electric";
    private String brand = "Tesla";
    private String model = "Cyber Truck";

    public RoadVehicles() {
    }

    public RoadVehicles(int numberOfWheels, double noughtToSixty, int numberOfPeople, String engineType, String brand, String model) {
        this.numberOfWheels = numberOfWheels;
        this.noughtToSixty = noughtToSixty;
        this.numberOfPeople = numberOfPeople;
        this.engineType = engineType;
        this.brand = brand;
        this.model = model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getNoughtToSixty() {
        return noughtToSixty;
    }

    public void setNoughtToSixty(double noughtToSixty) {
        this.noughtToSixty = noughtToSixty;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

