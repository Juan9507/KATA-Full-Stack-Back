package com.sofkau.kataFullStack.Service;

import com.sofkau.kataFullStack.model.ModList;
import com.sofkau.kataFullStack.repository.IListRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class ListServive {

    @Autowired
    private IListRepository iListRepository;

    public ArrayList<ModList> obtenerList() {
        return (ArrayList<ModList>) iListRepository.findAll();
    }
}
