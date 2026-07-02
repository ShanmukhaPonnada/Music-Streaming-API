package com.Nayan.Music_Streaming.service;

import com.Nayan.Music_Streaming.entity.Album;

import java.util.List;

public interface AlbumService {

    Album create(Album album);

    Album getById(Long id);

    List<Album> getAll();

    Album update(Long id, Album album);

    void delete(Long id);
}
