package com.Nayan.Music_Streaming.service.impl;

import com.Nayan.Music_Streaming.entity.Song;
import com.Nayan.Music_Streaming.repository.SongRepository;
import com.Nayan.Music_Streaming.service.SongService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SongServiceImpl implements SongService {

    private final SongRepository repo;

    @Override
    public Song create(Song song) {
        return repo.save(song);
    }

    @Override
    public Song getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public List<Song> getAll() {
        return repo.findAll();
    }

    @Override
    public Song update(Long id, Song song) {
        Song old = repo.findById(id).orElseThrow();
        old.setName(song.getName());
        old.setGenre(song.getGenre());
        old.setAlbum(song.getAlbum());
        return repo.save(old);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}


