package com.Nayan.Music_Streaming.repository;

import com.Nayan.Music_Streaming.entity.Album;
import com.Nayan.Music_Streaming.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    List<Song> findSongsById(Long id);
}

