package com.Nayan.Music_Streaming.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaylistMeta {
    private LocalDate createdDate;
    private String createdPlatform;
}


