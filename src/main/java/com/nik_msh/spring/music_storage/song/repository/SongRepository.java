package com.nik_msh.spring.music_storage.song.repository;

import com.nik_msh.spring.music_storage.song.entity.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {
}
