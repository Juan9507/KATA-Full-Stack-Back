package com.sofkau.kataFullStack.controlador;

import com.sofkau.kataFullStack.dto.DtoList;
import com.sofkau.kataFullStack.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Controlador para los end point de las listas
 */
@CrossOrigin
@RestController
@RequestMapping("/api/list")
public class ConList {

    /**
     * Inyeccion del servicio
     */
    @Autowired
    private ListService listService;

    /**
     * Crear una lista
     * @param dtoList - recibe el onjeto dto
     * @return - devuelve la creacion
     */
    @PostMapping("/save")
    public DtoList create(@RequestBody DtoList dtoList) {
        return this.listService.create(dtoList);
    }

    /**
     * Consultar todas las listas
     * @return - devuelve la lista
     */
    @GetMapping("")
    public ArrayList<DtoList> obtenerListDto() {
        return listService.obtenerListDto();
    }

    /**
     * Elimina una lista con id
     * @param id - recibe el id de la lista
     * @return - retorna el mensaje
     */
    @DeleteMapping(path = "/{id}")
    public String eliminarListaPorId(@PathVariable("id") Long id) {
        boolean ok = this.listService.eliminarLista(id);
        if (ok) {
            return "Se eliminó la lista con id " + id;
        } else {
            return "No pudo eliminar la lista con id" + id;
        }
    }
}
