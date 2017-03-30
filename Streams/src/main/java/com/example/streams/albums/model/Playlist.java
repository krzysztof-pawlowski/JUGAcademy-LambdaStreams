package com.example.streams.albums.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Playlist {

    @Getter
    private Album album;

    public List<MusicFile> getMusicFiles() {
        return Collections.singletonList(new MusicFile());
    }
}
