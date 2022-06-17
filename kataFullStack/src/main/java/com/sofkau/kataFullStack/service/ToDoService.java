package com.sofkau.kataFullStack.service;

import com.sofkau.kataFullStack.dto.DtoToDo;
import com.sofkau.kataFullStack.model.ModToDo;
import com.sofkau.kataFullStack.repository.IToDoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para inyectar el IListRepository para
 * utilizar las sentencias sql
 *
 * @author Juan David Rivera </juandavidnaranj75@gmail.com>
 * @version 1.0.0
 * @since 1.0.0
 */
@Service
@Validated
public class ToDoService {

    /**
     * Inyeccion del repositorio
     */
    @Autowired
    private IToDoRepository iTodoRepository;

    /**
     * Inyeccion del mapper
     */
    @Autowired
    ModelMapper modelMapper;

    /**
     * Obtener todas las listas, se devuelve el objeto dto
     * y no la entidad
     * @return
     */
    public ArrayList<DtoToDo> obtenerToDoDto(){
        List<ModToDo> modToDo = new ArrayList<>();
        List<DtoToDo> dtoToDo = new ArrayList<>();
        modToDo = (List<ModToDo>) iTodoRepository.findAll();
        //Mapear la entidad y devolver el objeto
        return (ArrayList<DtoToDo>) modelMapper.map(modToDo,dtoToDo.getClass());
    }

    /**
     * Obtener las tareas con el id de la lista
     * @param id - recibe el id
     * @return - devuelve la lista
     */
    public ArrayList<DtoToDo> obtenerToDoAllId(Long id){
        List<ModToDo> modToDo = new ArrayList<>();
        List<DtoToDo> dtoToDo = new ArrayList<>();
        modToDo = iTodoRepository.findAllId(id);
        //Mapear la entidad y devolver el objeto
        return (ArrayList<DtoToDo>) modelMapper.map(modToDo,dtoToDo.getClass());
    }

    /**
     * Crear una lista, devuelve igual el objecto y no la entidad
     * @param dtoToDo - recibe el onjeto
     * @return
     */
    public DtoToDo create(DtoToDo dtoToDo){
        ModToDo listEntity = modelMapper.map(dtoToDo, ModToDo.class);
        listEntity = iTodoRepository.save(listEntity);
        return modelMapper.map(listEntity, DtoToDo.class);
    }

    /**
     * Eliminar un elemento de la lista
     * @param id - recibe el id a eliminar
     * @return - retorna valor boleano
     */
    public boolean eliminarToDo(Long id) {
        try{
            iTodoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
