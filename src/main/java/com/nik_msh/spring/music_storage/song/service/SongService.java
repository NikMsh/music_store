package com.nik_msh.spring.music_storage.song.service;

import com.nik_msh.spring.music_storage.odt.ObjectDefinitionType;
import com.nik_msh.spring.music_storage.song.dto.SongDTO;
import com.nik_msh.spring.music_storage.song.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    @Autowired
    SongRepository songRepository;

    public List<SongDTO> getSongs() {
        return ObjectDefinitionType.getSongsDTOs(songRepository.findAll());
    }
}
