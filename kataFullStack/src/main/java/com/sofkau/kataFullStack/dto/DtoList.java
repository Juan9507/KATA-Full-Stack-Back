package com.sofkau.kataFullStack.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * clase dto para que el usuario no
 * haga contacto directo con la entidad
 *
 * @author Juan David Rivera </juandavidnaranjo75@gmail.com>
 * @version v1.0.0
 * @since v1.0.0
 */
public class DtoList {

    /**
     * atributo id
     */
    private Long id;

    /**
     * atributo nombre de la lista
     */
    @NotBlank
    @Size(max = 300)
    private String listName;

    /**
     * Controlador vacio
     */
    public DtoList() {
    }

    /**
     * Controlador solo con el parametro id
     *
     * @param id - recibe el id
     */
    public DtoList(Long id) {
        this.id = id;
    }

    /**
     * Controlador solo como parametro el nombre de la lista
     *
     * @param listName - recibe el nombre de la lista
     */
    public DtoList(String listName) {
        this.listName = listName;
    }

    /**
     * constrolador con todod los parametros
     *
     * @param id       - recibe el id
     * @param listName - recibe el nombre de la lista
     */
    public DtoList(Long id, String listName) {
        this.id = id;
        this.listName = listName;
    }

    /**
     * obtener el id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * modificar el id
     *
     * @param id - recibe el id a modificar
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * obtener el nombre de la lista
     *
     * @return
     */
    public String getListName() {
        return listName;
    }

    /**
     * modificar el nombre
     *
     * @param listName - recibe el nombre a modificar
     */
    public void setListName(String listName) {
        this.listName = listName;
    }
}
