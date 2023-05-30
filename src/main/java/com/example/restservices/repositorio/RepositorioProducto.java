package com.example.restservices.repositorio;

import com.example.restservices.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioProducto extends JpaRepository <Producto,Long> {

}
