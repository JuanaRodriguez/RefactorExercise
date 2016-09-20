package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link RegularRental}
 */
public class RegularRentalTest {

    private static final double DELTA = 0;

    private Rental rental;

    @Before
    public void setUp() {
        final String title = "Stars Wars";
        final Movie movie = new Movie(title);
        final int daysRented = 2;
        this.rental = new RegularRental(movie, daysRented);
    }

    @Test
    public void test_calculateAmount() {
        final double expected = 2;
        assertEquals(expected, this.rental.calculateAmount(), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPoints() {
        final int expected = 1;
        assertEquals(expected, this.rental.calculateFrequentRenterPoints());
    }
}
