package inheritance;

import java.util.ArrayList;

public class Theater extends Place {
    public ArrayList<String> movies;

    public Theater() {
    }

    public Theater(String name, ArrayList<String> moviesList) {
        this.name = name;
        this.movies = moviesList;
        this.stars = 0;
    }

    public void addMovie(String newMovie) {

        this.movies.add(newMovie);
    }

    public void removeMovie(String newMovie) {

        this.movies.remove(newMovie);

    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", movies=" + movies.toString() +
                '}';
    }
}