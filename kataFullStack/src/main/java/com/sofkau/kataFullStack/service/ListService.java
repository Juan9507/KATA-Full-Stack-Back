package com.sofkau.kataFullStack.service;

import com.sofkau.kataFullStack.dto.DtoList;
import com.sofkau.kataFullStack.model.ModList;
import com.sofkau.kataFullStack.repository.IListRepository;
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
public class ListService {

    /**
     * Inyeccion del repositorio
     */
    @Autowired
    private IListRepository iListRepository;

    /**
     * Inyeccion del mapper
     */
    @Autowired
    private ModelMapper modelMapper;

    /**
     * Obtener todas las listas, se devuelve el objeto dto
     * y no la entidad
     * @return
     */
    public ArrayList<DtoList> obtenerListDto(){
        List<ModList> modList = new ArrayList<>();
        List<DtoList> dtoList = new ArrayList<>();
        modList = (List<ModList>) iListRepository.findAll();
        //Mapear la entidad y devolver el objeto
        return (ArrayList<DtoList>) modelMapper.map(modList,dtoList.getClass());
    }

    /**
     * Crear una lista, devuelve igual el objecto y no la entidad
     * @param dtoList
     * @return
     */
    public DtoList create(DtoList dtoList){
        ModList listEntity = modelMapper.map(dtoList, ModList.class);
        listEntity = iListRepository.save(listEntity);
        return modelMapper.map(listEntity, DtoList.class);
    }

    /**
     * Eliminar un elemento de la lista
     * @param id - recibe el id a eliminar
     * @return - retorna valor boleano
     */
    public boolean eliminarLista(Long id) {
        try{
            iListRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


}
