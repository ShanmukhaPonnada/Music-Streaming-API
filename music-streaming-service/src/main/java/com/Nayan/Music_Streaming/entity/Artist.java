package com.Nayan.Music_Streaming.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Artist {

    @Id @GeneratedValue
    private Long id;

    @NotBlank
    private String name;

    @OneToMany(mappedBy = "artist")
    private List<Album> albums = new ArrayList<>();
}

