package com.curso.anemus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.curso.anemus.entity.Curso;
import com.curso.anemus.service.CursoService;

@RestController
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@GetMapping
	public List<Curso> lista(){
		return cursoService.listarCurso();
	}
	@GetMapping("/{id}")
	public Optional<Curso> listaId(Integer id){
		return cursoService.listarCursoId(id);
	}
	
	@PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Curso cadastrar(@RequestBody Curso curso) {
        return cursoService.salvarCurso(curso);
    }
}
