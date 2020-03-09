public class Ferry extends Boat
{
    private int maxNumberOfPassengers;

    public Ferry(String nameOfBoat, String yearOfManufacture, int maxNumberOfPassengers)
    {
        super(nameOfBoat, yearOfManufacture);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public Ferry(int maxNumberOfPassengers)
    {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public int getMaxNumberOfPassengers()
    {
        return maxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers)
    {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    @Override
    public String toString()
    {
        System.out.println("Boat Name: " + this.getNameOfBoat() + "\nMaximum Number of Capacity: " + this.maxNumberOfPassengers);
        return "Boat Name:" + this.getNameOfBoat() + "\nMaximum Number of Capacity: " + this.maxNumberOfPassengers;
    }

}
