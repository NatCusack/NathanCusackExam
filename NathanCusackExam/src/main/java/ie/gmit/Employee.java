package ie.gmit;
/*
File Name: Employee
Author: Nathan Cusack
Date: 09/03/2020
Description: In class Exam on Maven, JUnit and JaCoCo for Software Engineering with Test.

 */
public class Employee {
    private String title;
    private String name;
    private String ppsNumber;
    private String phoneNumber;
    private String employmentType;
    private int age;

    public Employee(String title, String name, String ppsNumber, String phoneNumber, String employmentType, int age) {
        if(title == "Mr" || title == "Mrs" || title == "Miss")
        {
            this.title = title;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Title");
        }
        if (name.length() >= 5 && name.length() <= 22)
        {
            this.name = name;
        }
        else
        {
            throw new IllegalArgumentException("Name Provided Not Valid");
        }
        if(ppsNumber.length() == 6)
        {
            this.ppsNumber = ppsNumber;
        }
        else
        {
            throw new IllegalArgumentException("Invalid PPS Number Entered");
        }
        if(phoneNumber.length() == 7)
        {
            this.phoneNumber = phoneNumber;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Phone Number Entered");
        }
        if(employmentType == "Full-time" || employmentType == "Part-time")
        {
            this.employmentType = employmentType;
        }
        else
        {
            throw new IllegalArgumentException("Employment Type Incorrect");
        }
        if(age > 18)
        {
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException("Age Must be Over 18");
        }
    }

    public String getTitle() {
        return title;
    }
    
    public String getEmploymentType() {
        return employmentType;
    }


}
