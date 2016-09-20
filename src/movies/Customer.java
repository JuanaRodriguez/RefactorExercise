package org.fundacionjala.movies;


/**
 * The class Customer manage the data of a customer.
 *
 * @autor Juana Rodriguez
 */
public class Customer {
    private String name;

    /**
     * Constructor Customer.
     *
     * @param name name of a customer.
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Get the name of the customer.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }
}
