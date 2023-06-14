package com.example.restservices.repositorio;

import com.example.restservices.modelo.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioTarea extends JpaRepository<Tareas, Long> {

}
