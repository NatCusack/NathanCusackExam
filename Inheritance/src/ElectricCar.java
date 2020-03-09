import com.sun.org.apache.xpath.internal.operations.Bool;

public class ElectricCar extends RoadVehicles
{
    int rangeInMiles = 250;
    Boolean autoPilot = Boolean.TRUE;

    public ElectricCar() {
    }


    public ElectricCar(int rangeInMiles, Boolean autoPilot) {
        this.rangeInMiles = rangeInMiles;
        this.autoPilot = autoPilot;
    }

    public ElectricCar(int numberOfWheels, double noughtToSixty, int numberOfPeople, String engineType, String brand, String model, int rangeInMiles, Boolean autoPilot) {
        super(numberOfWheels, noughtToSixty, numberOfPeople, engineType, brand, model);
        this.rangeInMiles = rangeInMiles;
        this.autoPilot = autoPilot;
    }

    public int getRangeInMiles() {
        return rangeInMiles;
    }

    public void setRangeInMiles(int rangeInMiles) {
        this.rangeInMiles = rangeInMiles;
    }

    public Boolean getAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(Boolean autoPilot) {
        this.autoPilot = autoPilot;
    }
}
