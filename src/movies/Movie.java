package org.fundacionjala.movies;

/**
 * The class manage the data of movies.
 *
 * @autor Juana Rodriguez
 */
public class Movie {
    private String title;

    /**
     * Constructor Movie.
     *
     * @param title title of the movie.
     */
    public Movie(String title) {
        this.title = title;
    }

    /**
     * Get the title of a movie.
     *
     * @return title of a movie.
     */
    public String getTitle() {
        return title;
    }
}
