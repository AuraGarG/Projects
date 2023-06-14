package com.example.restservices.servicio;

import com.example.restservices.modelo.Tareas;
import com.example.restservices.repositorio.RepositorioTarea;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
@AllArgsConstructor
public class ServTareasImpl implements servicio {

    private final RepositorioTarea repositorioTarea;

    @Override
    public ArrayList<Tareas> obtenerlista() {
        return (ArrayList<Tareas>) repositorioTarea.findAll();
    }

    @Override
    public Tareas crearTareas(Tareas tareas) {
        return repositorioTarea.save(tareas);
    }

    @Override
    public Tareas buscarTareas(Long idTareas) {
        return repositorioTarea.findById(idTareas).orElseThrow(() -> {
            throw new RuntimeException();
        });
    }

    public Tareas modificarTareas(Tareas task){
        Tareas modifiedTask = repositorioTarea.findById(task.getId()).get();
        modifiedTask.setUpdate(task.getUpdate());
        return repositorioTarea.save(modifiedTask);
    }

    @Override
    public boolean eliminarTareas(Long id) {
        try {
            repositorioTarea.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
