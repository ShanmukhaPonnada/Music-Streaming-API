package com.Nayan.Music_Streaming.service;

import com.Nayan.Music_Streaming.entity.Playlist;

import java.util.List;


public interface PlaylistService {

    Playlist create(Playlist playlist);

    Playlist getById(Long id);

    List<Playlist> getAll();

    Playlist update(Long id, Playlist playlist);

    void delete(Long id);
}