public class Trawler extends Boat
{
    private int cargoCapacity;

    public Trawler(String nameOfBoat, String yearOfManufacture, int cargoCapacity)
    {
        super(nameOfBoat, yearOfManufacture);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity()
    {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity)
    {
        this.cargoCapacity = cargoCapacity;
    }

    public Trawler(int cargoCapacity)
    {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString()
    {
        System.out.println("Boat Name: " + this.getNameOfBoat() + "\nCargo Capacity: " + this.cargoCapacity);
        return "Boat Name: " + this.getNameOfBoat() + "\nCargo Capacity" + this.cargoCapacity;
    }
}
