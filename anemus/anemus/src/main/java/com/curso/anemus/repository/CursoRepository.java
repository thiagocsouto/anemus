package com.curso.anemus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.anemus.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
