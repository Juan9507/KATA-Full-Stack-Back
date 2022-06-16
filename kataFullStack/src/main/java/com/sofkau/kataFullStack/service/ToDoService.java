package com.sofkau.kataFullStack.service;

import com.sofkau.kataFullStack.model.ModList;
import com.sofkau.kataFullStack.model.ModToDo;
import com.sofkau.kataFullStack.repository.IToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Clase para inyectar el IListRepository para
 * utilizar las sentencias sql
 *
 * @author Juan David Rivera </juandavidnaranj75@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
@Service
public class ToDoService {

    /**
     * Inyeccion del repositorio
     */
    @Autowired
    private IToDoRepository iTodoRepository;
}
