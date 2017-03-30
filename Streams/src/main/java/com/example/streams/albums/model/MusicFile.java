package com.example.streams.albums.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MusicFile {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String extension;

    @Getter
    @Setter
    private byte[] bytes;
}
