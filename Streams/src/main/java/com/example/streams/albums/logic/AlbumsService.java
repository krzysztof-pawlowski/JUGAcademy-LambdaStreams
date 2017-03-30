package com.example.streams.albums.logic;

import com.example.streams.albums.model.Album;
import com.example.streams.albums.model.Artist;
import com.example.streams.albums.model.MusicFile;
import com.example.streams.albums.model.Playlist;

public class AlbumsService {

    public MusicFile getRockFirstMusicFileForArtist(Artist artist) {
        return artist.getAlbums().stream()
            .filter(album -> Album.Genre.ROCK.equals(album.getGenre()))
            .limit(1)
            .map(Playlist::new)
            .flatMap(playlist -> playlist.getMusicFiles().stream())
            .findFirst()
            .orElse(null);
    }
}
