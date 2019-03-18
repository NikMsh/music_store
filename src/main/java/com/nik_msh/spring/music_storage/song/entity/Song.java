package com.nik_msh.spring.music_storage.song.entity;

import com.nik_msh.spring.music_storage.singer.entity.Singer;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int year;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "genre_id")
//    private Genre songGenre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "singer_id")
    private Singer singer;
}
