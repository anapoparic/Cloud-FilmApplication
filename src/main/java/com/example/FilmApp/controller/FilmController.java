package com.example.FilmApp.controller;

import com.example.FilmApp.model.Film;
import com.example.FilmApp.service.interfaces.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/films")
public class FilmController {
    private final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Film>> getAllFilms(){
        List<Film> films = this.filmService.findAll();
        return new ResponseEntity<>(films, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable Long id){
        Film film = this.filmService.findById(id);
        return new ResponseEntity<>(film, HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<Film> saveFilm(@RequestBody Film film){
        Film filmRet = this.filmService.save(film);
        return new ResponseEntity<>(filmRet, HttpStatus.OK);
    }


}
