package com.projeto.integrado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.integrado.entity.Recurso;

public interface RecursoRepository extends JpaRepository<Recurso, Integer> {
	Recurso findByRecursoNome(String recursoNome);
}