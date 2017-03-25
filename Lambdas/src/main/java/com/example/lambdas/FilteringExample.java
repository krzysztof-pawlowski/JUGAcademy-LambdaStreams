package com.example.lambdas;

import com.example.model.Album;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class FilteringExample {

    private List<Album> albums;

    public FilteringExample(List<Album> albums) {
        this.albums = albums;
    }

    public List<Album> filterAlbumsByName(String name) {
        return filterAlbumsByPredicate(album -> name.equals(album.getName()), name);
    }

    public List<Album> filterAlbumsByArtist(String artist) {
        return filterAlbumsByPredicate(album -> artist.equals(album.getArtist()), artist);
    }

    public List<Album> filterAlbumsByGenre(Album.Genre genre) {
        return filterAlbumsByPredicate(album -> genre.equals(album.getGenre()), genre);
    }

    private List<Album> filterAlbumsByPredicate(Predicate<Album> predicate, Object testArg) {
        if (albums == null) {
            return Collections.emptyList();
        }
        if (testArg == null) {
            return albums;
        }
        List<Album> filteredAlbums = new ArrayList<>();
        for (Album album : albums) {
            if (predicate.test(album)) {
                filteredAlbums.add(album);
            }
        }
        return filteredAlbums;
    }

}
