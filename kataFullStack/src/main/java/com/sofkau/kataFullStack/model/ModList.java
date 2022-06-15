package com.sofkau.kataFullStack.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

/**
 * Entidad list, creacion de la tabla list
 *
 * @author Juan David Rivera </juandavidnaranjo75@gmail.com>
 * @version v1.0.0
 * @since v1.0.0
 */
@Entity
public class ModList {

    /**
     * atributo id, clave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * atributo nombre de la lista
     */
    @Column(length = 300, nullable = false, name = "list_name")
    private String listName;

    /**
     * Controlador vacio
     */
    public ModList() {
    }

    /**
     * constrolador con dos parametros
     *
     * @param id       - recibe el id
     * @param listName - recibe el nombre de la lista
     */
    public ModList(Long id, String listName) {
        this.id = id;
        this.listName = listName;
    }

    /**
     * Controlador solo como parametro el id
     *
     * @param id - recibe el id
     */
    public ModList(Long id) {
        this.id = id;
    }

    /**
     * Controlador solo como parametro el id
     *
     * @param listName - recibe el nombre de la lista
     */
    public ModList(String listName) {
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
