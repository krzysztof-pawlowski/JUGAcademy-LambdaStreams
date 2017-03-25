package com.example.lambdas;

import com.example.model.Album;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

    private List<Album> albums;

    public SortingExample(List<Album> albums) {
        this.albums = albums;
    }

    public List<Album> getSortedByName() {
        return getSortedByComparator((a1, a2) -> a1.getName().compareTo(a2.getName()));
    }

    public List<Album> getSortedByArtist() {
        return getSortedByComparator(Comparator.comparing(Album::getArtist));
    }

    private List<Album> getSortedByComparator(Comparator<Album> comparator) {
        if (albums == null) {
            return Collections.emptyList();
        }
        List<Album> albumsCopy = new ArrayList<>(albums);
        albumsCopy.sort(comparator);
        return albumsCopy;
    }

}
