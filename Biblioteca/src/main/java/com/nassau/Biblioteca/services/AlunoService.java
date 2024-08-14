package com.nassau.Biblioteca.services;


import com.nassau.Biblioteca.models.Aluno;
import com.nassau.Biblioteca.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> create(Aluno aluno) {
        alunoRepository.save(aluno);
        return list();
    }

    public List<Aluno> list() {
        return alunoRepository.findAll();
    }

    public List<Aluno> update(Long id, Aluno aluno) {
        Aluno alunoToUpdate = alunoRepository.findById(id).orElseThrow();
        alunoToUpdate.setNome(aluno.getNome());
        alunoRepository.save(alunoToUpdate);
        return list();
    }

    public List<Aluno> delete(Long id) {
        alunoRepository.deleteById(id);
        return list();
    }
}