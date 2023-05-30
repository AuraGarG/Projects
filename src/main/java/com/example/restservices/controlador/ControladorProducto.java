package com.example.restservices.controlador;

import com.example.restservices.modelo.Producto;
import com.example.restservices.repositorio.RepositorioProducto;
import com.example.restservices.servicio.ServicioProductoImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/procto")
@RequiredArgsConstructor
public class ControladorProducto {
    @Autowired
     ServicioProductoImpl servicioProducto;

    @GetMapping()
    public ArrayList <Producto> obtenerProductos(){
        return servicioProducto.obtenerProductos();
    }
    @PostMapping()
    public Producto crearProducto(@RequestBody Producto procto){
        return this.servicioProducto.crearProducto(procto);
    }
}
