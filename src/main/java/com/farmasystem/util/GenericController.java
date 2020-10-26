package com.farmasystem.util;

import java.util.List;

public interface GenericController<T> {
    void inserir(T entity);
    void delete(Long id);
    List<T> listar();
    T objetoPorId(Long id);
}
