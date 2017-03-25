package com.example.lambdas;

import com.example.model.Album;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SortingExampleTest {

    private SortingExample sortingExample;

    @Before
    public void before() {
        sortingExample = new SortingExample(AlbumsCollection.getAlbums());
    }

    @Test
    public void getSortedByName_shouldReturnAlbumsSortedByName() {
        // When
        List<Album> sortedAlbums = sortingExample.getSortedByName();

        // Then
        assertThat(sortedAlbums).hasSize(5);
        assertThat(sortedAlbums.get(0).getName()).isEqualTo("A Day At The Races");
        assertThat(sortedAlbums.get(1).getName()).isEqualTo("A Night At The Opera");
        assertThat(sortedAlbums.get(2).getName()).isEqualTo("Celebration Day");
        assertThat(sortedAlbums.get(3).getName()).isEqualTo("Doo-bop");
        assertThat(sortedAlbums.get(4).getName()).isEqualTo("Piano");
    }

    @Test
    public void getSortedByArtist_shouldReturnAlbumsSortedByArtist() {
        // When
        List<Album> sortedAlbums = sortingExample.getSortedByArtist();

        // Then
        assertThat(sortedAlbums).hasSize(5);
        assertThat(sortedAlbums.get(0).getArtist()).isEqualTo("Led Zeppelin");
        assertThat(sortedAlbums.get(1).getArtist()).isEqualTo("Leszek Mozdzer");
        assertThat(sortedAlbums.get(2).getArtist()).isEqualTo("Miles Davis");
        assertThat(sortedAlbums.get(3).getArtist()).isEqualTo("Queen");
        assertThat(sortedAlbums.get(4).getArtist()).isEqualTo("Queen");
    }
}
