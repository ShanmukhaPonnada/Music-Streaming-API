package com.Nayan.Music_Streaming.controller;

import com.Nayan.Music_Streaming.entity.Playlist;
import com.Nayan.Music_Streaming.service.PlaylistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/playlists")
public class PlaylistController {

    private final PlaylistService service;

    @PostMapping
    public Playlist create(@RequestBody Playlist playlist){
        return service.create(playlist);
    }

    @GetMapping("/{id}")
    public Playlist get(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping
    public List<Playlist> all(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Playlist update(@PathVariable Long id, @RequestBody Playlist playlist){
        return service.update(id, playlist);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}

