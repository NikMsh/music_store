package com.nik_msh.spring.music_storage.singer.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="singer")
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String singerName;
}
