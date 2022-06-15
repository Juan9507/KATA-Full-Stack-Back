package com.sofkau.kataFullStack.Service;

import com.sofkau.kataFullStack.model.ModToDo;
import com.sofkau.kataFullStack.repository.IToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * Clase para inyectar el IListRepository para
 * utilizar las sentencias sql
 *
 * @author Juan David Rivera </juandavidnaranj75@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public class ToDoService {

    /**
     * Inyeccion del repositorio
     */
    @Autowired
    private IToDoRepository iTodoRepository;

    ArrayList<ModToDo> obtenerToDo() {
        return (ArrayList<ModToDo>) iTodoRepository.findAll();
    }
}
