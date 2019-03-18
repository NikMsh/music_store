package com.nik_msh.spring.music_storage.genre.dto;

import com.nik_msh.spring.music_storage.genre.entity.Genre;
import com.nik_msh.spring.music_storage.song.dto.SongDTO;
import lombok.Data;

import java.util.List;

@Data
public class GenreDTO {
    private Long id;
    private String genreName;

//    private List<SongDTO> genreSongs;

    public GenreDTO(Genre genre) {
        this.id = genre.getId();
        this.genreName = genre.getGenreName();
    }
}
