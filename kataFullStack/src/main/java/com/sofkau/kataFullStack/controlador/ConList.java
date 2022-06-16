package com.sofkau.kataFullStack.controlador;

import com.sofkau.kataFullStack.dto.DtoList;
import com.sofkau.kataFullStack.model.ModList;
import com.sofkau.kataFullStack.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/api/list")
public class ConList {

    @Autowired
    private ListService listService;

    @PostMapping("/save")
    public DtoList create(@RequestBody DtoList dtoList) {
        return this.listService.create(dtoList);
    }

    @GetMapping("")
    public ArrayList<DtoList> obtenerListDto() {
        return listService.obtenerListDto();
    }
}
