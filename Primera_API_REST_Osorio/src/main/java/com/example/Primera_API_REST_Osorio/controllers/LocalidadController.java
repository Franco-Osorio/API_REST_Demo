package com.example.Primera_API_REST_Osorio.controllers;

import com.example.Primera_API_REST_Osorio.entities.Localidad;
import com.example.Primera_API_REST_Osorio.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidad")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
