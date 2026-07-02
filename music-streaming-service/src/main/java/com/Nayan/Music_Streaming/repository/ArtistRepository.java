package com.Nayan.Music_Streaming.repository;

import com.Nayan.Music_Streaming.entity.Album;
import com.Nayan.Music_Streaming.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

    @Query("SELECT a.albums FROM Artist a WHERE a.id = :artistId")
    List<Album> findAlbumsByArtist(Long artistId);

    @Query("SELECT COUNT(s) FROM Song s WHERE s.album.artist.id = :artistId")
    Long countSongsByArtist(Long artistId);
}
