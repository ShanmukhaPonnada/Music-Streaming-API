package com.Nayan.Music_Streaming.service.impl;

import com.Nayan.Music_Streaming.entity.Album;
import com.Nayan.Music_Streaming.repository.AlbumRepository;
import com.Nayan.Music_Streaming.service.AlbumService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository repo;

    @Override
    public Album create(Album album) {
        return repo.save(album);
    }

    @Override
    public Album getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public List<Album> getAll() {
        return repo.findAll();
    }

    @Override
    public Album update(Long id, Album album) {
        Album old = repo.findById(id).orElseThrow();
        old.setTitle(album.getTitle());
        old.setArtist(album.getArtist());
        return repo.save(old);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
