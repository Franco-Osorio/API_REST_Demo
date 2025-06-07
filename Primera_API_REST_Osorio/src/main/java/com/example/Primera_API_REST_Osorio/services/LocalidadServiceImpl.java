package com.example.Primera_API_REST_Osorio.services;

import com.example.Primera_API_REST_Osorio.entities.Localidad;
import com.example.Primera_API_REST_Osorio.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

}
