package com.sofkau.kataFullStack;

import com.sofkau.kataFullStack.dto.DtoList;
import com.sofkau.kataFullStack.dto.DtoToDo;
import com.sofkau.kataFullStack.model.ModList;
import com.sofkau.kataFullStack.service.ToDoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestToDoService {

    @Autowired
    ToDoService toDoService;

    @Test
    public void validarCreacion() {
        ModList modList = new ModList(3L);
        DtoToDo tareaRegistrada =  toDoService.create(new DtoToDo("repasar",false, modList));
        assertNotNull(tareaRegistrada);
    }
}
