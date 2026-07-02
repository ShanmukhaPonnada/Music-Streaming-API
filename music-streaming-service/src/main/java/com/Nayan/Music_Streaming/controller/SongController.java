package com.Nayan.Music_Streaming.controller;


import com.Nayan.Music_Streaming.entity.Song;
import com.Nayan.Music_Streaming.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/songs")
public class SongController {

    private final SongService service;

    @PostMapping
    public Song create(@RequestBody Song song) {
        return service.create(song);
    }

    @GetMapping("/{id}")
    public Song get(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping
    public List<Song> getAll(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Song update(@PathVariable Long id, @RequestBody Song song){
        return service.update(id, song);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}

