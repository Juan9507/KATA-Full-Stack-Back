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
    private String task;

    /**
     * Atributo boleano para saber si la atrea esta completada
     */
    private Boolean complete;

    /**
     * Relacion muchos a uno
     */
    private ModList lista;

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
        this.task = tareas;
    }

    /**
     * Constructor cons todos los parametros
     *
     * @param id     - recibe el id
     * @param task - recibe la tarea
     */
    public DtoToDo(Long id, String task, Boolean complete, ModList lista) {
        this.id = id;
        this.task = task;
        this.complete = complete;
        this.lista = lista;
    }

    /**
     * Constructor cons todos los parametros
     *
     * @param lista   - recibe el id de la lista
     * @param task - recibe la tarea
     */
    public DtoToDo(String task, ModList lista) {
        this.task = task;
        this.lista = lista;
    }

    public DtoToDo(String task, Boolean complete, ModList lista) {
        this.task = task;
        this.complete = complete;
        this.lista = lista;
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
    public String getTask() {
        return task;
    }

    /**
     * Setter para las tareas
     *
     * @param tareas - recibe la tarea
     */
    public void setTask(String tareas) {
        this.task = tareas;
    }

    /**
     * Getter para saber si la tarea esta completa
     * @return - devuelve un boleano
     */
    public Boolean getComplete() {
        return complete;
    }

    /**
     * Setter para modificar la tarea si esta completa o no
     * @param complete - recibe un valor boleano
     */
    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    /**
     * Getter para el objeto de la lista
     *
     * @return
     */
    public ModList getLista() {
        return lista;
    }

    /**
     * Setter para el objeto de la lista
     *
     * @param lista - recibe el objeto
     */
    public void setLista(ModList lista) {
        this.lista = lista;
    }
}
