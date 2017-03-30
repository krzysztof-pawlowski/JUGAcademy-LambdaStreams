package com.example.streams.albums.logic;

import com.example.streams.albums.model.Album;
import com.example.streams.albums.model.Artist;
import com.example.streams.albums.model.MusicFile;
import com.example.streams.albums.model.Playlist;

import java.util.List;

public class AlbumsService {


    public MusicFile getRockFirstMusicFileForArtist(Artist artist) {
        Album rockAlbum = null;
        for (Album album : artist.getAlbums()) {
            if (album.getGenre().equals(Album.Genre.ROCK)) {
                rockAlbum = album;
            }
        }

        if (rockAlbum == null) {
            return null;
        }

        Playlist playlist = new Playlist(rockAlbum);

        List<MusicFile> musicFiles = playlist.getMusicFiles();

        if (musicFiles == null || musicFiles.isEmpty()) {
            return null;
        }

        return musicFiles.get(0);
    }

}
