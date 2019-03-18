package com.nik_msh.spring.music_storage.odt;

import com.nik_msh.spring.music_storage.genre.dto.GenreDTO;
import com.nik_msh.spring.music_storage.genre.entity.Genre;
import com.nik_msh.spring.music_storage.singer.dto.SingerDTO;
import com.nik_msh.spring.music_storage.singer.entity.Singer;
import com.nik_msh.spring.music_storage.song.dto.SongDTO;
import com.nik_msh.spring.music_storage.song.entity.Song;

import java.util.ArrayList;
import java.util.List;

public class ObjectDefinitionType {

    public static List<GenreDTO> getGenresDTOs(Iterable<Genre> genres) {
        List<GenreDTO> genreDTOS = new ArrayList<>();
        for (Genre genre : genres) {
            genreDTOS.add(new GenreDTO(genre));
        }
        return genreDTOS;
    }

    public static List<SingerDTO> getSingersDTOs(Iterable<Singer> singers) {
        List<SingerDTO> singerDTOS = new ArrayList<>();
        for (Singer singer : singers) {
            singerDTOS.add(new SingerDTO(singer));
        }
        return singerDTOS;
    }

    public static List<SongDTO> getSongsDTOs(Iterable<Song> songs) {
        List<SongDTO> songDTOS = new ArrayList<>();
        for (Song song : songs) {
            songDTOS.add(new SongDTO(song));
        }
        return songDTOS;
    }
}
