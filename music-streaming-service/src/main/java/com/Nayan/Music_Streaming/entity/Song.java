package com.Nayan.Music_Streaming.entity;

import com.Nayan.Music_Streaming.enums.Genre;
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
public class Song {

    @Id @GeneratedValue
    private Long id;

    @NotBlank
    private String name;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToOne
    private Album album;

    @ManyToMany(mappedBy = "songs")
    private List<Playlist> playlists = new ArrayList<>();
}


