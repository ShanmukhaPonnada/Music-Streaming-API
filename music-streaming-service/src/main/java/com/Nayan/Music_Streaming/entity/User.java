package com.Nayan.Music_Streaming.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id @GeneratedValue
    private Long id;

    @NotBlank
    private String username;

    @OneToMany(mappedBy = "user")
    private List<Playlist> playlists = new ArrayList<>();
}
