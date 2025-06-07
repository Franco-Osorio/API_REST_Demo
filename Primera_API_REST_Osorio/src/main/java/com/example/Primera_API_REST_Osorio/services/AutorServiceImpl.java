package com.example.Primera_API_REST_Osorio.services;

import com.example.Primera_API_REST_Osorio.entities.Autor;
import com.example.Primera_API_REST_Osorio.repositories.AutorRepository;
import com.example.Primera_API_REST_Osorio.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

}
