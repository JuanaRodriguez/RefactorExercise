package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link RentalHandler}
 */
public class HandlerRentalTest {

    private static final double DELTA = 0;
    private RentalHandler rentalHandler;

    @Before
    public void setUp() {
        final int daysRented = 2;
        final String customerName = "Juana";
        final String titleOne = "Star Wars";
        final String titleTwo = "Mr Robot";
        final Customer customer = new Customer(customerName);
        this.rentalHandler = new RentalHandler(customer);
        final Movie starWars = new Movie(titleOne);
        final Movie mrRobot = new Movie(titleTwo);
        this.rentalHandler.addRental(new NewReleaseRental(starWars, daysRented));
        this.rentalHandler.addRental(new RegularRental(mrRobot, daysRented));
    }

    @Test
    public void test_calculateTheFrequentRenterPoints() {
        final int expectedResult = 3;
        assertEquals(expectedResult, this.rentalHandler.calculateFrequentRenterPoints());
    }

    @Test
    public void test_addToAListRental() {
        final int expectedResult = 2;
        assertEquals(expectedResult, this.rentalHandler.countRentals());
    }

    @Test
    public void test_calculateTheTotalAmount() {
        final double expectedResult = 8.0;
        assertEquals(expectedResult, this.rentalHandler.calculateTotalAmount(), DELTA);
    }


}