package com.farmasystem.util;

import java.util.List;

public interface GenericService<T> {
    void inserir(T entity);
    void delete(Long id);
    List<T> listar();
    T objetoPorId(Long id);
}
