package com.nik_msh.spring.music_storage.singer.dto;

import com.nik_msh.spring.music_storage.singer.entity.Singer;
import lombok.Data;

@Data
public class SingerDTO {
    private Long id;
    private String singerName;

    public SingerDTO(Singer singer) {
        this.id = singer.getId();
        this.singerName = singer.getSingerName();
    }
}
