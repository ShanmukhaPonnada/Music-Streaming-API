package com.Nayan.Music_Streaming.service;

import com.Nayan.Music_Streaming.entity.Song;

import java.util.List;

public interface SongService {

    Song create(Song song);

    Song getById(Long id);

    List<Song> getAll();

    Song update(Long id, Song song);

    void delete(Long id);
}

