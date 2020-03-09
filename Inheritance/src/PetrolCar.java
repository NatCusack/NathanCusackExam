public class PetrolCar extends RoadVehicles
{
    private double engineSize = 1.0;
    private double milePerGallon = 50.43;

    public PetrolCar()
    {
    }

    public PetrolCar(double engineSize, double milePerGallon)
    {
        this.engineSize = engineSize;
        this.milePerGallon = milePerGallon;
    }

    public PetrolCar(int numberOfWheels, double noughtToSixty, int numberOfPeople, String engineType, String brand, String model, double engineSize, double milePerGallon) {
        super(numberOfWheels, noughtToSixty, numberOfPeople, engineType, brand, model);
        this.engineSize = engineSize;
        this.milePerGallon = milePerGallon;
    }

    public double getEngineSize()
    {
        return engineSize;
    }

    public void setEngineSize(double engineSize)
    {
        this.engineSize = engineSize;
    }

    public double getMilePerGallon()
    {
        return milePerGallon;
    }

    public void setMilePerGallon(double milePerGallon)
    {
        this.milePerGallon = milePerGallon;
    }
}
