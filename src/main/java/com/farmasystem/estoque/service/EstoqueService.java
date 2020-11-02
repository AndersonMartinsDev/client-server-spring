package com.farmasystem.estoque.service;

import com.farmasystem.estoque.entity.Estoque;
import com.farmasystem.estoque.repository.EstoqueRepository;
import com.farmasystem.util.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService implements GenericService<Estoque> {
    
    @Autowired
    private EstoqueRepository repository;

    @Override
    public void inserir(Estoque entity) {
        repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Estoque> listar() {
        return repository.findAll();
    }

    @Override
    public Estoque objetoPorId(Long id) {
        return repository.getOne(id);
    }
}
