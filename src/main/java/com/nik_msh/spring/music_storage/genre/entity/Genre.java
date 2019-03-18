package com.nik_msh.spring.music_storage.genre.entity;

import com.nik_msh.spring.music_storage.song.dto.SongDTO;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String genreName;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "songGenre")
//    private List<SongDTO> genreSongs;
}
