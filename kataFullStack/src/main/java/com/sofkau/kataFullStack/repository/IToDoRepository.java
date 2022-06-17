package com.sofkau.kataFullStack.repository;

import com.sofkau.kataFullStack.dto.DtoToDo;
import com.sofkau.kataFullStack.model.ModToDo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Inteface para las sentencias del crud
 * entidad todo_list
 *
 * @author Juan David Rivera </juandavidnaranjo75@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface IToDoRepository extends CrudRepository<ModToDo, Long> {

    @Query(value = "SELECT * FROM lista_tarea WHERE id_lista = ?1", nativeQuery = true)
    public abstract ArrayList<ModToDo> findAllId(Long id);
}
