package com.nik_msh.spring.music_storage.singer.repository;

import com.nik_msh.spring.music_storage.singer.entity.Singer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingerRepository extends CrudRepository<Singer, Long> {
}
