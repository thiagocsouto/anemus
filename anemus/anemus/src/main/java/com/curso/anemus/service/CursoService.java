package com.curso.anemus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.anemus.entity.Curso;
import com.curso.anemus.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	public Curso salvarCurso(Curso curso) {
		return cursoRepository.save(curso);
	}

	public List<Curso> listarCurso() {
		return cursoRepository.findAll(); 
	}
	
	public Optional<Curso> listarCursoId(Integer id) {
		return cursoRepository.findById(id);
	}
	public void deletarCurso(Integer id) {
		cursoRepository.deleteById(id);
	}
}
