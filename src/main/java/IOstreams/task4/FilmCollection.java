package IOstreams.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilmCollection implements Serializable {

    Map<String, List<String>> filmCollection;

    public FilmCollection(Map<String, List<String>> filmCollection) {
        this.filmCollection = filmCollection;
    }

    public FilmCollection() {
        this.filmCollection = new HashMap<>();
    }

    public void addFilm (String ... films) {
        for(String s:films)
            filmCollection.put(s, new ArrayList<>());
    }

    public void addActors(String film, String ... actors) {
        if (!filmCollection.containsKey(film))
            addFilm(film);
        filmCollection.get(film).addAll(List.of(actors));
    }

    public void remove(String ... films){
        for(String s:films)
            filmCollection.remove(s);
    }

    public void removeActors (String film, String ... actors){
        if (filmCollection.containsKey(film))
            for(String s:actors)
                filmCollection.get(film).removeAll(List.of(actors));
    }

    @Override
    public String toString() {
        return "FilmCollection{" + filmCollection;
    }


}
