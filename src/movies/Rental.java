package org.fundacionjala.movies;


/**
 * Rental.
 *
 * @autor Juana Rodriguez
 */
public abstract class Rental {

    protected static final int POINT = 1;

    private Movie movie;
    private double increment;
    private double thisAmount;
    protected double daysLimit;
    protected int daysRented;

    /**
     * Constructor Rental.
     *
     * @param movie to be rented
     * @param daysRented days rented of a movie.
     * @param thisAmount amount to pay for a movie.
     * @param increment value that increment the amount of rental
     * @param daysLimit limit days rented, that has a movie
     */
    public Rental(Movie movie, int daysRented, double thisAmount, double increment, int daysLimit) {
        this.movie = movie;
        this.daysRented = daysRented;
        this.thisAmount = thisAmount;
        this.increment = increment;
        this.daysLimit = daysLimit;
    }

    /**
     * Get the movie rented.
     *
     * @return movie rented.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Calculate thea amount of the movie rented.
     *
     * @return amount the calculate amount of the movie rented.
     */
    public double calculateAmount() {
        if (this.daysRented > daysLimit) {
            this.thisAmount += (this.daysRented - daysLimit) * this.increment;
        }
        return this.thisAmount;
    }

    /**
     * Calculate the frequent renter points.
     *
     * @return point, the renter points.
     */
    public int calculateFrequentRenterPoints() {
        return POINT;
    }
}
