package com.nassau.Biblioteca.controllers;


import com.nassau.Biblioteca.models.Aluno;
import com.nassau.Biblioteca.services.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public List<Aluno> create(@RequestBody Aluno aluno) {
        return alunoService.create(aluno);
    }

    @GetMapping
    public List<Aluno> list() {
        return alunoService.list();
    }

    @PutMapping("/{id}")
    public List<Aluno> update(@PathVariable("id") Long id, @RequestBody Aluno aluno) {
        return alunoService.update(id, aluno);
    }

    @DeleteMapping("/{id}")
    public List<Aluno> delete(@PathVariable("id") Long id) {
        return alunoService.delete(id);
    }
}