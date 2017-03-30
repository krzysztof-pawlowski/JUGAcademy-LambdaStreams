package com.example.streams.albums.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Album {
    public enum Genre { ROCK, JAZZ }

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private Genre genre;

    @Setter
    @Getter
    private int yearOfIssue;

}
