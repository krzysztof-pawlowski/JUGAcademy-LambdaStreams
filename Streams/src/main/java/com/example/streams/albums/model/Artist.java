package com.example.streams.albums.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Artist {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private List<Album> albums = new ArrayList<>();
}
