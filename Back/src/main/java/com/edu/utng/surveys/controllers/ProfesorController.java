package com.edu.utng.surveys.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edu.utng.surveys.models.ProfesorModel;
import com.edu.utng.surveys.services.ProfesorService;

@CrossOrigin ("http://localhost:4200/")
@RestController
@RequestMapping("/profesor")
public class ProfesorController {
    
    @Autowired
    ProfesorService profesorService;

    @GetMapping()
    public ArrayList<ProfesorModel> obtenerProfesor(){
        return profesorService.obtenerProfesor();
    }

    @PostMapping
    public ProfesorModel guardarProfesor(@RequestBody ProfesorModel profesor){
        return this.profesorService.guardarProfesor(profesor);
    }

    @GetMapping(path = "/{id}")
    public Optional <ProfesorModel> obtenerProfesorPorId(@PathVariable("id") Long id) {
        return this.profesorService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<ProfesorModel> obtenerid(@RequestParam("id") Long id){
        return this.profesorService.obtenerid(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorIdPregunta(@PathVariable("id") Long id){
        boolean ok = this.profesorService.eliminarProfesor(id);
        if (ok) {
            return "Se elimino el usuario con matricula:" + id;
        } else{
            return "No se pudo eliminar el usuario con matricula: " + id;
        }
    }
}
