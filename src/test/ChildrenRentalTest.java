package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ChildrenRental}
 */
public class ChildrenRentalTest {

    private static final double DELTA = 0;
    private Rental childrenRental;

    @Before
    public void setUp() {
        final String title = "Stars Wars";
        final int daysRented = 2;
        final Movie movie = new Movie(title);
        this.childrenRental = new ChildrenRental(movie, daysRented);
    }

    @Test
    public void test_calculateAmount() {
        final double expectedResult = 1.5;
        assertEquals(expectedResult, this.childrenRental.calculateAmount(), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPoints() {
        final int expectedResult = 1;
        assertEquals(expectedResult, this.childrenRental.calculateFrequentRenterPoints());
    }
}
