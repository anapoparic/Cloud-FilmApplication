package com.example.FilmApp.repository;

import com.example.FilmApp.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface FilmRepository extends JpaRepository<Film, Long> {
}
