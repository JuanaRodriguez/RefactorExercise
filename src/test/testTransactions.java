package test;

import junit.framework.Assert;
import movies.Customer;
import movies.Movie;
import movies.Rental;
import movies.Transactions;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by JuanaRodriguez on 8/23/2016.
 */
public class testTransactions {

    @Test
    public void Verify() {
        Transactions transactions = new Transactions();
        Movie firstMovie = new Movie("Pokemon",0);
        Movie secondMovie = new Movie("Games",0);
        Rental firstRental = new Rental(firstMovie, 2);
        Rental secondRental = new Rental(secondMovie, 2);
        transactions.addRental(firstRental);
        transactions.addRental(secondRental);
        //assertEquals();
        System.out.println(transactions.statement());
    }


}
