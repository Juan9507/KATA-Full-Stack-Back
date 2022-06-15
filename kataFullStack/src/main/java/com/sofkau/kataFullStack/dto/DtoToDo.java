package com.sofkau.kataFullStack.dto;

import com.sofkau.kataFullStack.model.ModList;

/**
 * clase dto por hacer,
 * clase para que interatue le usuario y no con la
 * entidad
 *
 * @author Juan David Rivera </juandavidnaranjo75@gmail.com>
 * @version v1.0.0
 * @since v1.0.0
 */
public class DtoToDo {

    /**
     * atributo id
     */
    private Long id;

    /**
     * atributo nombre de la lista
     */
    private String tareas;

    /**
     * Relacion muchos a uno
     */
    private ModList list;

    /**
     * Constructor vacio
     */
    public DtoToDo() {
    }

    /**
     * Constructor con un parametro
     *
     * @param id - recibe el id
     */
    public DtoToDo(Long id) {
        this.id = id;
    }

    /**
     * Constructor con un parametro
     *
     * @param tareas - recibe la tarea
     */
    public DtoToDo(String tareas) {
        this.tareas = tareas;
    }

    /**
     * Constructor cons todos los parametros
     *
     * @param id     - recibe el id
     * @param tareas - recibe la tarea
     */
    public DtoToDo(Long id, String tareas, ModList list) {
        this.id = id;
        this.tareas = tareas;
        this.list = list;
    }

    public Long getId() {
        return id;
    }

    /**
     * Getter para el id
     *
     * @return - retorna el id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter para las tareas
     *
     * @return - retorna la tarea
     */
    public String getTareas() {
        return tareas;
    }

    /**
     * Setter para las tareas
     *
     * @param tareas - recibe la tarea
     */
    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    /**
     * Getter para el objeto de la lista
     *
     * @return
     */
    public ModList getList() {
        return list;
    }

    /**
     * Setter para el objeto de la lista
     *
     * @param list - recibe el objeto
     */
    public void setList(ModList list) {
        this.list = list;
    }
}
