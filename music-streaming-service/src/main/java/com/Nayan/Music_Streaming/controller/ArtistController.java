package com.Nayan.Music_Streaming.controller;

import com.Nayan.Music_Streaming.entity.Artist;
import com.Nayan.Music_Streaming.repository.ArtistRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
@RequiredArgsConstructor
public class ArtistController {

    private final ArtistRepository repo;

    @PostMapping
    public Artist create(@Valid @RequestBody Artist a){
        return repo.save(a);
    }

    @GetMapping
    public List<Artist> all(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Artist get(@PathVariable Long id){
        return repo.findById(id).orElseThrow();
    }

    @PutMapping
    public Artist update(@RequestBody Artist a){
        return repo.save(a);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }
}

