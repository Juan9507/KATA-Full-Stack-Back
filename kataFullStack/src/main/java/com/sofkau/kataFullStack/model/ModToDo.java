package com.sofkau.kataFullStack.model;

import javax.persistence.*;

/**
 * Entidad por hacer, tabla por hacer del todoList
 *
 * @author Juan David Rivera </juandavidnaranjo75@gmail.com>
 * @version v1.0.0
 * @since v1.0.0
 */
@Entity
@Table(name = "lista_tarea")
public class ModToDo {

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
    @Column(length = 300, nullable = false, name = "tareas")
    private String tareas;

    /**
     * Relacion muchos a uno
     * muchas tareas pueden pertenecer a una sola lista
     */
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_lista")
    private ModList lista;

    /**
     * Constructor vacio
     */
    public ModToDo() {
    }

    /**
     * Constructor con un parametro
     *
     * @param id - recibe el id
     */
    public ModToDo(Long id) {
        this.id = id;
    }

    /**
     * Constructor con un parametro
     *
     * @param tareas - recibe la tarea
     */
    public ModToDo(String tareas) {
        this.tareas = tareas;
    }

    /**
     * Constructor cons todos los parametros
     *
     * @param id     - recibe el id
     * @param tareas - recibe la tarea
     */
    public ModToDo(Long id, String tareas, ModList lista) {
        this.id = id;
        this.tareas = tareas;
        this.lista = lista;
    }

    /**
     * Getter para el id
     *
     * @return - retorna el id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter para el id
     *
     * @param id - recibe el id
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
        return lista;
    }

    /**
     * Setter para el objeto de la lista
     *
     * @param list - recibe el objeto
     */
    public void setList(ModList list) {
        this.lista = list;
    }
}
