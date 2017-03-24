package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Album {
    public enum Genre { ROCK, JAZZ }

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String artist;

    @Setter
    @Getter
    private Genre genre;

    @Setter
    @Getter
    private int yearOfIssue;
}
