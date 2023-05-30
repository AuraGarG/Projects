package com.example.restservices.servicio;

import com.example.restservices.modelo.Producto;
import com.example.restservices.repositorio.RepositorioProducto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class ServicioProductoImpl{

    @Autowired
    private final RepositorioProducto repositorioProducto;

    public ArrayList<Producto> obtenerProductos(){
        return (ArrayList<Producto>)repositorioProducto.findAll();
    }

    public Producto crearProducto(Producto procto){
        return repositorioProducto.save(procto);
    }


}
