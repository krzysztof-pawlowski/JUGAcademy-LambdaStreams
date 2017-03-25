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
        if (albums == null) {
            return Collections.emptyList();
        }
        List<Album> albumsCopy = new ArrayList<>(albums);
        albumsCopy.sort(new Comparator<Album>() {
            @Override public int compare(Album album1, Album album2) {
                return album1.getName().compareTo(album2.getName());
            }
        });
        return albumsCopy;
    }

    public List<Album> getSortedByArtist() {
        if (albums == null) {
            return Collections.emptyList();
        }
        List<Album> albumsCopy = new ArrayList<>(albums);
        albumsCopy.sort(new Comparator<Album>() {
            @Override public int compare(Album album1, Album album2) {
                return album1.getArtist().compareTo(album2.getArtist());
            }
        });
        return albumsCopy;
    }



}
