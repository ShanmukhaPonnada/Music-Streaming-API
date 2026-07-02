package com.Nayan.Music_Streaming.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Playlist {

    @Id @GeneratedValue
    private Long id;

    @NotBlank
    private String name;

    @Embedded
    private PlaylistMeta meta;

    @ManyToOne
    private User user;

    @ManyToMany
    @JoinTable(
            name = "playlist_song",
            joinColumns = @JoinColumn(name="playlist_id"),
            inverseJoinColumns = @JoinColumn(name="song_id")
    )
    private List<Song> songs = new ArrayList<>();
}

