package com.example.restservices.servicio;

import com.example.restservices.modelo.Tareas;
import java.util.List;

public interface servicio {

    List<Tareas> obtenerlista();

    Tareas crearTareas(Tareas tareas);

    Tareas buscarTareas(Long idTarea);

    Tareas modificarTareas(Tareas task);

    boolean eliminarTareas(Long id);

}
