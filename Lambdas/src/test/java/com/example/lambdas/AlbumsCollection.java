package com.example.lambdas;

import com.example.model.Album;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class AlbumsCollection {

    @Getter
    private static List<Album> albums = Arrays.asList(
        new Album("Celebration Day", "Led Zeppelin", Album.Genre.ROCK, 2013),
        new Album("A Night At The Opera", "Queen", Album.Genre.ROCK, 1975),
        new Album("A Day At The Races", "Queen", Album.Genre.ROCK, 1976),
        new Album("Piano", "Leszek Mozdzer", Album.Genre.JAZZ, 2004),
        new Album("Doo-bop", "Miles Davis", Album.Genre.JAZZ, 1992)
    );
}
