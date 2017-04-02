package com.example.streams.albums.logic;

import com.example.streams.albums.model.Album;
import com.example.streams.albums.model.Artist;
import com.example.streams.albums.model.MusicFile;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AlbumsServiceTest {

    private AlbumsService  albumsService;

    @Before
    public void before() {
        albumsService = new AlbumsService();
    }

    @Test
    public void getRockFirstMusicFileForArtist_noAlbums_shouldReturnNull() {
        // Given
        Artist artist = new Artist();

        // When
        MusicFile musicFile = albumsService.getRockFirstMusicFileForArtist(artist);

        // Then
        assertThat(musicFile).isNull();
    }

    @Test
    public void getRockFirstMusicFileForArtist_noRockAlbums_shouldReturnNull() {
        // Given
        Artist artist = new Artist();
        Album album = new Album("tittle", Album.Genre.JAZZ, 2001);
        artist.getAlbums().add(album);

        // When
        MusicFile musicFile = albumsService.getRockFirstMusicFileForArtist(artist);

        // Then
        assertThat(musicFile).isNull();
    }

    @Test
    public void getRockFirstMusicFileForArtist_forAlbumIssuedBefore2000_shouldReturnNull() {
        // Given
        Artist artist = new Artist();
        Album album = new Album("tittle", Album.Genre.ROCK, 1999);
        artist.getAlbums().add(album);

        // When
        MusicFile musicFile = albumsService.getRockFirstMusicFileForArtist(artist);

        // Then
        assertThat(musicFile).isNull();
    }

    @Test
    public void getRockFirstMusicFileForArtist_forAlbumIssuedAfter2000_shouldReturnNull() {
        // Given
        Artist artist = new Artist();
        Album album = new Album("tittle", Album.Genre.ROCK, 2001);
        artist.getAlbums().add(album);

        // When
        MusicFile musicFile = albumsService.getRockFirstMusicFileForArtist(artist);

        // Then
        assertThat(musicFile).isNotNull();
        assertThat(musicFile.getName()).isEqualTo("file1");
        assertThat(musicFile.getExtension()).isEqualTo("wav");
        assertThat(musicFile.getBytes()).containsSequence((byte)1, (byte)2, (byte)3);
    }
}
