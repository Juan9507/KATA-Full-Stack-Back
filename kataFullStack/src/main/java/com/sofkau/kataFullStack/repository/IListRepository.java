package com.sofkau.kataFullStack.repository;

import com.sofkau.kataFullStack.model.ModList;
import org.springframework.data.repository.CrudRepository;

/**
 * Inteface para las sentencias del crud
 * tabla list
 *
 * @author Juan David Rivera </juandavidnaranjo75@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IListRepository extends CrudRepository<ModList, Long> {

}
