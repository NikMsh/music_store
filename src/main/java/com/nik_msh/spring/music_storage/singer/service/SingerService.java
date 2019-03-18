package com.nik_msh.spring.music_storage.singer.service;

import com.nik_msh.spring.music_storage.odt.ObjectDefinitionType;
import com.nik_msh.spring.music_storage.singer.dto.SingerDTO;
import com.nik_msh.spring.music_storage.singer.repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerService {
    @Autowired
    SingerRepository singerRepository;

    public List<SingerDTO> getSingers() {
        return ObjectDefinitionType.getSingersDTOs(singerRepository.findAll());
    }
}
