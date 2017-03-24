package com.example.lambdas;

import com.example.model.Album;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PredicateExampleTest {

    private PredicateExample predicateExample;

    @Before
    public void before() {
        predicateExample = new PredicateExample(AlbumsCollection.getAlbums());
    }

    @Test
    public void filterAlbumsByName_givenPianoAlbum_shouldReturnPianoAlbumOnly() {
        // When
        List<Album> filteredAlbums = predicateExample.filterAlbumsByName("Piano");

        // Then
        assertThat(filteredAlbums).hasSize(1);
        assertThat(filteredAlbums.get(0).getName()).isEqualTo("Piano");
    }

    @Test
    public void filterAlbumsByName_givenLedZeppelinArtist_shouldReturnLedZeppelinAlbumOnly() {
        // When
        List<Album> filteredAlbums = predicateExample.filterAlbumsByArtist("Led Zeppelin");

        // Then
        assertThat(filteredAlbums).hasSize(1);
        assertThat(filteredAlbums.get(0).getArtist()).isEqualTo("Led Zeppelin");
    }

    @Test
    public void filterAlbumsByName_givenJazzGenre_shouldReturnTwoJazzAlbumsOnly() {
        // When
        List<Album> filteredAlbums = predicateExample.filterAlbumsByGenre(Album.Genre.JAZZ);

        // Then
        assertThat(filteredAlbums).hasSize(2);
        assertThat(filteredAlbums.get(0).getName()).isEqualTo("Piano");
        assertThat(filteredAlbums.get(1).getName()).isEqualTo("Doo-bop");
    }
}
