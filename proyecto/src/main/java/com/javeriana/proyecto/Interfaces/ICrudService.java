package com.javeriana.proyecto.Interfaces;

import java.util.List;

import com.javeriana.proyecto.Entities.AbstractEntity;

public interface ICrudService <T extends AbstractEntity>
{
    List<T> getAll();
    T getByID(Long id);
    void newEntry(T entity);
    void updateEntry(T entity);
    void deleteEntry(Long id);
}
