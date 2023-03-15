package com.javeriana.proyecto.Interfaces;

import org.springframework.data.repository.CrudRepository;

import com.javeriana.proyecto.Entities.AbstractEntity;


public interface IEntityRepository<T extends AbstractEntity> extends CrudRepository<T, Long>
{
    
}
