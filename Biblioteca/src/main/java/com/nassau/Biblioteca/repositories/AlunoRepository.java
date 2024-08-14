package com.nassau.Biblioteca.repositories;



import com.nassau.Biblioteca.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    public List<Aluno> findAllById(Long id);
}

