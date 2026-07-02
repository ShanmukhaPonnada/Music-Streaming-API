package com.Nayan.Music_Streaming.repository;

import com.Nayan.Music_Streaming.enums.Genre;
import com.Nayan.Music_Streaming.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {

    List<Song> findByGenre(Genre genre);

    @Query("SELECT s FROM Song s ORDER BY size(s.playlists) DESC")
    List<Song> findMostPopularSongs();
}

