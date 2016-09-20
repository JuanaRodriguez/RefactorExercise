package org.fundacionjala.movies;

/**
 * The class calculated the amount and frequent renter points.
 *
 * @autor Juana Rodriguez
 */
public class RegularRental extends Rental {

    private static final double AMOUNT = 2;
    private static final double INCREMENT = 1.5;
    private static final int DAYS_LIMIT = 2;

    /**
     * Constructor RegularRental.
     *
     * @param movie      movie to be rented.
     * @param daysRented days rented of a movie.
     */
    public RegularRental(Movie movie, int daysRented) {
        super(movie, daysRented, AMOUNT, INCREMENT, DAYS_LIMIT);
    }
}
