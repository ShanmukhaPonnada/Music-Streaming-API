package com.Nayan.Music_Streaming.service.impl;

import com.Nayan.Music_Streaming.entity.Playlist;
import com.Nayan.Music_Streaming.repository.PlaylistRepository;
import com.Nayan.Music_Streaming.service.PlaylistService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PlaylistServiceImpl implements PlaylistService {

    private final PlaylistRepository repo;

    @Override
    public Playlist create(Playlist playlist) {
        return repo.save(playlist);
    }

    @Override
    public Playlist getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public List<Playlist> getAll() {
        return repo.findAll();
    }

    @Override
    public Playlist update(Long id, Playlist playlist) {
        Playlist old = repo.findById(id).orElseThrow();
        old.setName(playlist.getName());
        old.setSongs(playlist.getSongs());
        old.setUser(playlist.getUser());
        return repo.save(old);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
