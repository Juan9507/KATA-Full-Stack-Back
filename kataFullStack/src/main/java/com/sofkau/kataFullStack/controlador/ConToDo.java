package com.sofkau.kataFullStack.controlador;

import com.sofkau.kataFullStack.dto.DtoToDo;
import com.sofkau.kataFullStack.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Controlador para los end point de las tareas
 */
@CrossOrigin
@RestController
@RequestMapping("/api/ToDo")
public class ConToDo {

    /**
     * Inyeccion del servicio
     */
    @Autowired
    ToDoService toDoService;

    /**
     * Obtener todas las tareas
     * @return
     */
    @GetMapping("")
    public ArrayList<DtoToDo> obtenerToDo() {
        return toDoService.obtenerToDoDto();
    }

    /**
     * Obtener tareas con el id de la lista
     */
    @GetMapping(path = "/{id}")
    public ArrayList<DtoToDo> obtenerToDoAllId(@PathVariable("id") Long id){
        return toDoService.obtenerToDoAllId(id);
    }

    /**
     * Guardar una tarea
     * @param dtoToDo - recibe el body
     * @return - devuelve la creacion
     */
    @PostMapping("/save")
    public DtoToDo create(@RequestBody DtoToDo dtoToDo) {

        return this.toDoService.create(dtoToDo);
    }

    /**
     * Eliminar una tarea
     * @param id - recibe el id de
     * @return - devuelve el mensaje
     */
    @DeleteMapping(path = "/{id}")
    public String eliminarToDoPorId(@PathVariable("id") Long id) {
        boolean ok = this.toDoService.eliminarToDo(id);
        if (ok) {
            return "Se eliminó la tarea con id " + id;
        } else {
            return "No pudo eliminar la tarea con id" + id;
        }
    }
}
