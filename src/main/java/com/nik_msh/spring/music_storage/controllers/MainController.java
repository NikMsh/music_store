package com.nik_msh.spring.music_storage.controllers;

import com.nik_msh.spring.music_storage.genre.dto.GenreDTO;
import com.nik_msh.spring.music_storage.genre.service.GenreService;
import com.nik_msh.spring.music_storage.singer.dto.SingerDTO;
import com.nik_msh.spring.music_storage.singer.service.SingerService;
import com.nik_msh.spring.music_storage.song.dto.SongDTO;
import com.nik_msh.spring.music_storage.song.entity.Song;
import com.nik_msh.spring.music_storage.song.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private GenreService genreService;
    @Autowired
    private SingerService singersService;
    @Autowired
    private SongService songService;

    @GetMapping("/")
    public String getMainPage() {
        return "main_page";
    }

    @GetMapping("/genres")
    public String getGenres() {
        List<GenreDTO> genres = genreService.getGenres();
        StringBuilder result = new StringBuilder();
        for (GenreDTO genre : genres) {
            result.append(genre.toString());
        }
        return String.valueOf(result);
    }

    @GetMapping("/singers")
    public String getSingers() {
        List<SingerDTO> singers = singersService.getSingers();
        StringBuilder result = new StringBuilder();
        for (SingerDTO singer : singers) {
            result.append(singer.toString());
        }
        return String.valueOf(result);
    }

    @GetMapping("/songs")
    public String getSongs() {
        List<SongDTO> songs = songService.getSongs();
        StringBuilder result = new StringBuilder();
        for (SongDTO song : songs) {
            result.append(song.toString());
        }
        return String.valueOf(result);
    }
}
