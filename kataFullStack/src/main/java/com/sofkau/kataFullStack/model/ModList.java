package com.sofkau.kataFullStack.model;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

/**
 * Entidad list, creacion de la tabla list
 *
 * @author Juan David Rivera </juandavidnaranjo75@gmail.com>
 * @version v1.0.0
 * @since v1.0.0
 */
@Entity
@Table(name = "lista")
public class ModList {

    /**
     * atributo id, clave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    /**
     * atributo nombre de la lista
     */
    @Column(name = "lista_name", nullable = false)
    private String listName;

    /**
     * Hacer referencia a la tabla del many
     */
    @OnDelete(action= OnDeleteAction.CASCADE)
    @OneToMany(mappedBy = "lista")
    private List<ModToDo> toDoList;

    /**
     * Controlador vacio
     */
    public ModList() {
    }

    /**
     * Controlador solo con el parametro id
     *
     * @param id - recibe el id
     */
    public ModList(Long id) {
        this.id = id;
    }

    /**
     * Controlador solo como parametro el nombre de la lista
     *
     * @param listName - recibe el nombre de la lista
     */
    public ModList(String listName) {
        this.listName = listName;
    }

    /**
     * constrolador con todod los parametros
     *
     * @param id       - recibe el id
     * @param listName - recibe el nombre de la lista
     */
    public ModList(Long id, String listName) {
        this.id = id;
        this.listName = listName;
    }

    /**
     * Constructor con todos los parametros
     *
     * @param id
     * @param listName
     * @param modToDo
     */
    /*public ModList(Long id, String listName, List<ModToDo> modToDo) {
        this.id = id;
        this.listName = listName;
        this.modToDo = modToDo;
    }*/

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

    /**
     * Getter que retorna la lista del objeto ModToDo
     *
     * @return - retorna la lista
     */
    /*public List<ModToDo> getModToDo() {
        return modToDo;
    }*/

    /**
     * Setter para modificar la lista  del objeto ModToDo
     *
     * @param modToDo - recibe la lista
     */
    /*public void setModToDo(List<ModToDo> modToDo) {
        this.modToDo = modToDo;
    }*/
}
