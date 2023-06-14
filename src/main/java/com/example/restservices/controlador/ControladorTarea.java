package com.example.restservices.controlador;

import com.example.restservices.modelo.Tareas;
import com.example.restservices.repositorio.RepositorioTarea;
import com.example.restservices.servicio.ServTareasImpl;
import com.example.restservices.servicio.servicio;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class ControladorTarea {

    private final servicio serv;

    @GetMapping()
    public List<Tareas> obtenerlista() {
        return serv.obtenerlista();
    }

    @PostMapping()
    public ResponseEntity crearTareas(@RequestBody Tareas tareas) {
        return new ResponseEntity(serv.crearTareas(tareas), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity buscarTareas(@PathVariable("id")Long idTareas) {
        return new ResponseEntity(serv.buscarTareas(idTareas), HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity modificarTareas(@RequestBody Tareas task) {
        return new ResponseEntity(serv.modificarTareas(task),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity eliminarTareas(@PathVariable("id") Long idTareas) {
        boolean respuesta = serv.eliminarTareas(idTareas);
        if (respuesta == true) {
            return new ResponseEntity(HttpStatus.OK);

        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

}
