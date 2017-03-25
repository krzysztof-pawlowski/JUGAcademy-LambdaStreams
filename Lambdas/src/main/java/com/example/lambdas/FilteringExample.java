package com.example.lambdas;

import com.example.model.Album;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilteringExample {

    private List<Album> albums;

    public FilteringExample(List<Album> albums) {
        this.albums = albums;
    }

    public List<Album> filterAlbumsByName(String name) {
        if (albums == null) {
            return Collections.emptyList();
        }
        if (name == null) {
            return albums;
        }
        List<Album> filteredAlbums = new ArrayList<>();
        for (Album album : albums) {
            if (name.equals(album.getName())) {
                filteredAlbums.add(album);
            }
        }
        return filteredAlbums;
    }

    public List<Album> filterAlbumsByArtist(String artist) {
        if (albums == null) {
            return Collections.emptyList();
        }
        if (artist == null) {
            return albums;
        }
        List<Album> filteredAlbums = new ArrayList<>();
        for (Album album : albums) {
            if (artist.equals(album.getArtist())) {
                filteredAlbums.add(album);
            }
        }
        return filteredAlbums;
    }

    public List<Album> filterAlbumsByGenre(Album.Genre genre) {
        if (albums == null) {
            return Collections.emptyList();
        }
        if (genre == null) {
            return albums;
        }
        List<Album> filteredAlbums = new ArrayList<>();
        for (Album album : albums) {
            if (genre.equals(album.getGenre())) {
                filteredAlbums.add(album);
            }
        }
        return filteredAlbums;
    }

}
