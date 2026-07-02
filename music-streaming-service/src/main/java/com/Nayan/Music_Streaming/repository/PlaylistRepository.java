package com.Nayan.Music_Streaming.repository;

import com.Nayan.Music_Streaming.entity.Playlist;
import com.Nayan.Music_Streaming.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {

    List<Playlist> findByUserId(Long id);

    @Query("SELECT p.songs FROM Playlist p WHERE p.id = :playlistId")
    List<Song> getSongsInPlaylist(Long playlistId);

    @Query("SELECT p FROM Playlist p ORDER BY p.meta.createdDate DESC")
    List<Playlist> findLatestPlaylists();

    @Query("SELECT p FROM Playlist p WHERE size(p.songs) > :count")
    List<Playlist> findPlaylistsWithMoreThan(int count);

    @Query("SELECT p FROM Playlist p JOIN p.songs s WHERE s.id = :songId")
    List<Playlist> findPlaylistsContainingSong(Long songId);
}

