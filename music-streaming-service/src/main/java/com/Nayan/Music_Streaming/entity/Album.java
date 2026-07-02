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
public class Album {

    @Id @GeneratedValue
    private Long id;

    @NotBlank
    private String title;

    @ManyToOne
    @JoinColumn(name="artist_id")
    private Artist artist;

    @OneToMany(mappedBy = "album")
    private List<Song> songs = new ArrayList<>();
}

