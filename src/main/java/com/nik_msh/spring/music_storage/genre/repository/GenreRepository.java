package com.nik_msh.spring.music_storage.genre.repository;

import com.nik_msh.spring.music_storage.genre.entity.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {
}
