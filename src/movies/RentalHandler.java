package org.fundacionjala.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Handler the Rental of movies by customer.
 *
 * @autor Juana Rodriguez
 */
public class RentalHandler {
    private List<Rental> rentals;
    private Customer customer;

    /**
     * Constructor RentalHandler.
     *
     * @param customer for rental.
     */
    public RentalHandler(Customer customer) {
        this.rentals = new ArrayList<Rental>();
        this.customer = customer;
    }

    /**
     * Get count rentals.
     *
     * @return count rentals.
     */
    public int countRentals() {
        return this.rentals.size();
    }

    /**
     * Adds rental at the list.
     *
     * @param rental Rental to be added at the list.
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * Get the total amount.
     *
     * @return the total amount.
     */
    public double calculateTotalAmount() {
        return rentals.stream()
                .mapToDouble(Rental::calculateAmount).sum();
    }

    /**
     * Calculated the frequent renter points.
     *
     * @return the frequent renter points
     */
    public int calculateFrequentRenterPoints() {
        return rentals.stream()
                .mapToInt(Rental::calculateFrequentRenterPoints).sum();
    }
}
