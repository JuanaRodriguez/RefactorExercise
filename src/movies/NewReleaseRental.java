package org.fundacionjala.movies;

/**
 * The class NewReleaseRental calculated the amount and the frequent renter points.
 *
 * @autor Juana Rodriguez
 */
public class NewReleaseRental extends Rental {

    private static final double AMOUNT = 3;
    private static final double INCREMENT = 0;
    private static final int DAYS_LIMIT = 1;

    /**
     * Constructor NewReleaseRental.
     *
     * @param movie the movie rented
     * @param daysRented days rented, of the movie.
     */
    public NewReleaseRental(Movie movie, int daysRented) {
        super(movie, daysRented, AMOUNT, INCREMENT, DAYS_LIMIT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount() {
        return this.daysRented * AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints() {
        return (this.daysRented > DAYS_LIMIT) ? (this.POINT + 1) : this.POINT;
    }
}
