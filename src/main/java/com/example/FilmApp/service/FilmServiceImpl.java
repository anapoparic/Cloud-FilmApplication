package com.example.FilmApp.service;

import com.example.FilmApp.model.Film;
import com.example.FilmApp.repository.FilmRepository;
import com.example.FilmApp.service.interfaces.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    private final FilmRepository filmRepository;

    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }


    @Override
    public Film save(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public List<Film> findAll() {
        return this.filmRepository.findAll();
    }

    @Override
    public Film findById(Long id) {
        return this.filmRepository.findById(id).orElseGet(null);
    }
}
