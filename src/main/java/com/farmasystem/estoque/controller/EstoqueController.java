package com.farmasystem.estoque.controller;

import com.farmasystem.estoque.entity.Estoque;
import com.farmasystem.estoque.service.EstoqueService;
import com.farmasystem.util.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path ="/estoque")
public class EstoqueController implements GenericController<Estoque> {

    @Autowired
    private EstoqueService service;

    @Override
    @PostMapping
    public void inserir(@RequestBody Estoque entity) {
        service.inserir(entity);
    }

    @Override
    @DeleteMapping("{id}")
    public void delete(@PathVariable  Long id) {
        service.delete(id);
    }

    @Override
    @GetMapping
    public List<Estoque> listar() {
        return service.listar();
    }

    @Override
    @GetMapping(path ="{id}")
    public Estoque objetoPorId(@PathVariable Long id) {
        return service.objetoPorId(id);
    }
}
