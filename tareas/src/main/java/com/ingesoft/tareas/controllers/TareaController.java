package com.ingesoft.tareas.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ingesoft.tareas.model.Tarea;
import com.ingesoft.tareas.repositories.TareaRepository;

@RestController
@RequestMapping("/tareas")
public class TareaController {

    TareaRepository tareas;

    public TareaController(TareaRepository tareas){
        this.tareas = tareas;
    }

    @GetMapping("/")
    public List<Tarea> obtenerTodasLasTareas() {
        return tareas.findAll();
    }
    
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea crearTarea(@RequestBody Tarea todo) {
        return tareas.save(todo);
    }

}
