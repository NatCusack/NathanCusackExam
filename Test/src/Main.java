/*
Author: Nathan Cusack
Student Number: G00338306
Group: B
Date: 20/01/2019
Email: G00338306@gmit.ie
Module: Software Engineering with Test
Lecturer: Paul Lennon

Lab Exam: Exam on Inheritance and ArrayLists


 */

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        Boat irishBoat = new Boat("The Rocky Road", "1994");
        Ferry irishFerry = new Ferry ("The Aul Triangle", "2001",  250);
        Trawler irishTrawler = new Trawler ("Whiskey in Jar", "2013", 4000);

        List<Boat> listOfBoats = new ArrayList<Boat>();
        listOfBoats.add(irishBoat);
        listOfBoats.add(irishFerry);
        listOfBoats.add(irishTrawler);

        for(Boat iterate : listOfBoats) {
            iterate.toString();
        }
    }
}
