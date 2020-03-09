package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import java.util.EmptyStackException;

public class testEmployee {


    @DisplayName("Testing True Constructor")
    @Test
    void testConstructorTrue()
    {
        Employee myEmployee = new Employee("Mr","Nathan","12345C", "6824876", "Full-time", 23);
        assertEquals("Mr",myEmployee.getTitle());
    }


    @DisplayName("Testing Constructor with missing Title")
    @Test
    void testConstructorNoTitle()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("","Nathan","12345C", "6824876", "Full-Time", 23));
    }

    @DisplayName("Testing Constructor with missing Name")
    @Test
    void testConstructorNoName()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","","12345C", "6824876", "Full-Time", 23));
    }

    @DisplayName("Testing Constructor with missing PPS Number")
    @Test
    void testConstructorNoPPS()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nathan","", "6824876", "Full-Time", 23));
    }

    @DisplayName("Testing Constructor with missing Phone number")
    @Test
    void testConstructorNoPhone()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nathan","12345C", "", "Full-Time", 23));
    }

    @DisplayName("Testing Constructor with missing Employment Type")
    @Test
    void testConstructorNoEmploymentType()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nathan","12345C", "6824876", "", 23));
    }

    @DisplayName("Testing Constructor with missing Age")
    @Test
    void testConstructorNoAge()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nathan","12345C", "6824876", "Full-time", 0));
    }

    @DisplayName("Testing Constructor with Title = 'Mr'")
    @Test
    void testConstructorMr()
    {
        Employee myEmployee = new Employee("Mr","Nathan","12345C", "6824876", "Full-time", 23);
        assertEquals("Mr",myEmployee.getTitle());
    }

    @DisplayName("Testing Constructor with Title = 'Mrs'")
    @Test
    void testConstructorMrs()
    {
        Employee myEmployee = new Employee("Mrs","Natalie","12345C", "6824876", "Full-time", 23);
        assertEquals("Mrs",myEmployee.getTitle());
    }

    @DisplayName("Testing Constructor with Title = 'Miss'")
    @Test
    void testConstructorMiss()
    {
        Employee myEmployee = new Employee("Miss","Natalie","12345C", "6824876", "Full-time", 23);
        assertEquals("Miss",myEmployee.getTitle());
    }

    @DisplayName("Testing Constructor with Invalid Title")
    @Test
    void testConstructorInvalidTitle()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Cat","Nathan","12345C", "6824876", "Full-time", 23));
    }

    @DisplayName("Testing Constructor with Name less than 5 characters")
    @Test
    void testConstructorSmallName()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nate","12345C", "6824876", "Full-time", 23));
    }

    @DisplayName("Testing Constructor with Name less than 5 characters")
    @Test
    void testConstructorBigName()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nathaniel Cusack Von Elk","12345C", "6824876", "Full-time", 23));
    }

    @DisplayName("Testing Constructor with PPS Number less than 6 characters")
    @Test
    void testConstructorSmallPPS()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nathan","1234C", "6824876", "Full-time", 23));
    }

    @DisplayName("Testing Constructor with PPS Number greater than 6 characters")
    @Test
    void testConstructorBigPPS()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nathan","123456C", "6824876", "Full-time", 23));
    }

    @DisplayName("Testing Constructor with Phone Number less than 7 characters")
    @Test
    void testConstructorSmallPhoneNumber()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nathan","12345C", "68248", "Full-time", 23));
    }

    @DisplayName("Testing Constructor with Phone Number greater than 7 characters")
    @Test
    void testConstructorBigPhoneNumber()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nathan","12345C", "6824854645", "Full-time", 23));
    }

    @DisplayName("Testing Constructor with Employment Type set to Full-time")
    @Test
    void testConstructorFullTime()
    {
        Employee myEmployee = new Employee("Mr","Nathan","12345C", "6824876", "Full-time", 23);
        assertEquals("Full-time",myEmployee.getEmploymentType());
    }

    @DisplayName("Testing Constructor with Employment Type set to Part-time")
    @Test
    void testConstructorPartTime()
    {
        Employee myEmployee = new Employee("Mr","Nathan","12345C", "6824876", "Part-time", 23);
        assertEquals("Part-time",myEmployee.getEmploymentType());
    }

    @DisplayName("Testing Constructor with Invalid Employment Type")
    @Test
    void testConstructorInvalidEmploymentType()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nathan","12345C", "6824876", "Unemployed", 23));

    }

    @DisplayName("Testing Constructor with Age less than 18")
    @Test
    void testConstructorInvalidAge()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Nathan","12345C", "6824876", "Full-time", 16));

    }





}
