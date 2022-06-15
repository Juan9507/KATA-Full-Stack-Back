package com.sofkau.kataFullStack.Service;

import com.sofkau.kataFullStack.model.ModList;
import com.sofkau.kataFullStack.repository.IListRepository;
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
public class ListService {

    /**
     * Inyeccion del repositorio
     */
    @Autowired
    private IListRepository iListRepository;

    public ArrayList<ModList> obtenerList() {
        return (ArrayList<ModList>) iListRepository.findAll();
    }
}
