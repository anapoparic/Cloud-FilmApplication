package com.example.FilmApp.service.interfaces;

import com.example.FilmApp.model.Film;

import java.util.List;

public interface FilmService {
    Film save(Film film);
    List<Film> findAll();
    Film findById(Long id);

}
