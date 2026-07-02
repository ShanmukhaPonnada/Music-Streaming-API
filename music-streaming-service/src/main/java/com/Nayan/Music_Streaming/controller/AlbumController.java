package com.Nayan.Music_Streaming.controller;


import com.Nayan.Music_Streaming.entity.Album;
import com.Nayan.Music_Streaming.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/albums")
public class AlbumController {

    private final AlbumService service;

    @PostMapping
    public Album create(@RequestBody Album album){
        return service.create(album);
    }

    @GetMapping("/{id}")
    public Album get(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping
    public List<Album> getAll(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Album update(@PathVariable Long id, @RequestBody Album album){
        return service.update(id, album);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}

