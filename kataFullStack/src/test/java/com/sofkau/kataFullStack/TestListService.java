package com.sofkau.kataFullStack;

import com.sofkau.kataFullStack.dto.DtoList;
import com.sofkau.kataFullStack.service.ListService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestListService {

    @Autowired
    ListService listService;

    @Test
    public void contraintsValidationExceptionTest(){
        assertThrows(ConstraintViolationException.class, () -> {
           // roleServiseImplemet.create(new RoleDto(null));
            listService.create(new DtoList("Prueba 1"));
        });
    }
}
