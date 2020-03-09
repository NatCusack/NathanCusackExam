public class Boat
{
    private String nameOfBoat;
    private String yearOfManufacture;

    public Boat(String nameOfBoat, String yearOfManufacture)
    {
        this.nameOfBoat = nameOfBoat;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Boat()
    {
    }

    public String getNameOfBoat()
    {
        return nameOfBoat;
    }

    public void setNameOfBoat(String nameOfBoat)
    {
        this.nameOfBoat = nameOfBoat;
    }

    public String getYearOfManufacture()
    {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture)
    {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String toString()   {
        System.out.println("Boat Name: " + this.nameOfBoat + "\nYear of Manufacture: "+ this.yearOfManufacture);
        return "Boat Name: " + this.nameOfBoat + "\nYear of Manufacture: " + this.yearOfManufacture;
    }
}
