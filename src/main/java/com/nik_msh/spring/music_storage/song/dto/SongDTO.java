package com.nik_msh.spring.music_storage.song.dto;

import com.nik_msh.spring.music_storage.singer.entity.Singer;
import com.nik_msh.spring.music_storage.song.entity.Song;
import lombok.Data;

@Data
public class SongDTO {
    private Long id;
    private String songName;
    private int year;

    private Singer singer;

    public SongDTO(Song song) {
        this.id = song.getId();
        this.songName = song.getName();
        this.year = song.getYear();
        this.singer = song.getSinger();
    }
}
