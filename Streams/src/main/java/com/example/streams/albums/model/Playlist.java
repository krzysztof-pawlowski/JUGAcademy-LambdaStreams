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
        if (album.getYearOfIssue() > 2000) {
            return Collections.singletonList(new MusicFile("file1", "wav", new byte[] { 1, 2, 3 }));

        } else {
            return Collections.emptyList();
        }
    }
}
