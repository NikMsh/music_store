package com.nik_msh.spring.music_storage.genre.service;

import com.nik_msh.spring.music_storage.genre.dto.GenreDTO;
import com.nik_msh.spring.music_storage.genre.repository.GenreRepository;
import com.nik_msh.spring.music_storage.odt.ObjectDefinitionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    @Autowired
    GenreRepository genreRepository;

    public List<GenreDTO> getGenres() {
      return ObjectDefinitionType.getGenresDTOs(genreRepository.findAll());
    }
}
