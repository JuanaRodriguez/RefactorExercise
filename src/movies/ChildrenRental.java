package org.fundacionjala.movies;

/**
 * Calculates amount and frequent renter points.
 *
 * @autor Juana Rodriguez
 */
public class ChildrenRental extends Rental {

    private static final double AMOUNT = 1.5;
    private static final double INCREMENT = 1.5;
    private static final int DAYS_LIMIT = 3;

    /**
     * Constructor ChildrenRental.
     *
     * @param movie      movie to be rented.
     * @param daysRented days rented of a movie.
     */
    public ChildrenRental(Movie movie, int daysRented) {
        super(movie, daysRented, AMOUNT, INCREMENT, DAYS_LIMIT);
    }
}
