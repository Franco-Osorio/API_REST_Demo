package com.example.Primera_API_REST_Osorio.controllers;

import com.example.Primera_API_REST_Osorio.entities.Autor;
import com.example.Primera_API_REST_Osorio.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}
